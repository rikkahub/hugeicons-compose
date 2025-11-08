package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Inequality02: ImageVector
    get() {
        if (_inequality02 != null) {
            return _inequality02!!
        }
        _inequality02 = ImageVector.Builder(
            name = "Inequality02",
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
        moveTo(21f, 20f)
        horizontalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 16f)
        horizontalLineTo(17.1622f)
        curveTo(19.5429f, 16f, 20.7332f, 16f, 20.9652f, 15.3728f)
        curveTo(21.1971f, 14.7455f, 20.2628f, 14.0531f, 18.3943f, 12.6682f)
        lineTo(6.69853f, 4f)
        }
        }.build()

        return _inequality02!!
    }

private var _inequality02: ImageVector? = null
