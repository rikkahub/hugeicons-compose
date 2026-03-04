package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartAnalysis: ImageVector
    get() {
        if (_chartAnalysis != null) {
            return _chartAnalysis!!
        }
        _chartAnalysis = ImageVector.Builder(
            name = "ChartAnalysis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 11f)
        lineTo(5.5f, 8.5f)
        curveTo(6.51706f, 7.48294f, 7.02558f, 6.97442f, 7.63723f, 6.8616f)
        curveTo(7.87705f, 6.81737f, 8.12295f, 6.81737f, 8.36277f, 6.8616f)
        curveTo(8.97442f, 6.97442f, 9.48295f, 7.48295f, 10.5f, 8.5f)
        curveTo(11.5171f, 9.51705f, 12.0256f, 10.0256f, 12.6372f, 10.1384f)
        curveTo(12.8771f, 10.1826f, 13.1229f, 10.1826f, 13.3628f, 10.1384f)
        curveTo(13.9744f, 10.0256f, 14.4829f, 9.51705f, 15.5f, 8.5f)
        lineTo(21f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 15f)
        verticalLineTo(21f)
        moveTo(9f, 13f)
        verticalLineTo(21f)
        moveTo(15f, 16f)
        verticalLineTo(21f)
        moveTo(21f, 9f)
        verticalLineTo(21f)
        }
        }.build()

        return _chartAnalysis!!
    }

private var _chartAnalysis: ImageVector? = null
