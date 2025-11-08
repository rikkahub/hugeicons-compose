package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pinterest: ImageVector
    get() {
        if (_pinterest != null) {
            return _pinterest!!
        }
        _pinterest = ImageVector.Builder(
            name = "Pinterest",
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
        moveTo(12f, 11f)
        lineTo(8f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.97368f, 16.5724f)
        curveTo(10.5931f, 16.8473f, 11.2787f, 17f, 12f, 17f)
        curveTo(14.7614f, 17f, 17f, 14.7614f, 17f, 12f)
        curveTo(17f, 9.23858f, 14.7614f, 7f, 12f, 7f)
        curveTo(9.23858f, 7f, 7f, 9.23858f, 7f, 12f)
        curveTo(7f, 12.9108f, 7.24367f, 13.7646f, 7.66921f, 14.5f)
        }
        }.build()

        return _pinterest!!
    }

private var _pinterest: ImageVector? = null
