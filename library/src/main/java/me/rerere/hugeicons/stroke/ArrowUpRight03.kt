package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowUpRight03: ImageVector
    get() {
        if (_arrowUpRight03 != null) {
            return _arrowUpRight03!!
        }
        _arrowUpRight03 = ImageVector.Builder(
            name = "ArrowUpRight03",
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
        moveTo(16.5f, 7.5f)
        lineTo(6f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 6.18791f)
        curveTo(8f, 6.18791f, 16.0479f, 5.50949f, 17.2692f, 6.73079f)
        curveTo(18.4906f, 7.95209f, 17.812f, 16f, 17.812f, 16f)
        }
        }.build()

        return _arrowUpRight03!!
    }

private var _arrowUpRight03: ImageVector? = null
