package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartEvaluation: ImageVector
    get() {
        if (_chartEvaluation != null) {
            return _chartEvaluation!!
        }
        _chartEvaluation = ImageVector.Builder(
            name = "ChartEvaluation",
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
        moveTo(21f, 21f)
        horizontalLineTo(10f)
        curveTo(6.70017f, 21f, 5.05025f, 21f, 4.02513f, 19.9749f)
        curveTo(3f, 18.9497f, 3f, 17.2998f, 3f, 14f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.7048f, 9.33333f)
        lineTo(14.8311f, 13.9845f)
        curveTo(14.4123f, 14.6623f, 13.9369f, 15.686f, 13.0749f, 15.5344f)
        curveTo(12.0611f, 15.356f, 11.5742f, 13.8449f, 10.7026f, 13.3445f)
        curveTo(9.99285f, 12.9371f, 9.47971f, 13.4281f, 9.06475f, 14f)
        moveTo(21f, 4f)
        lineTo(19.1465f, 7f)
        moveTo(5f, 20f)
        lineTo(7.52632f, 16.2667f)
        }
        }.build()

        return _chartEvaluation!!
    }

private var _chartEvaluation: ImageVector? = null
