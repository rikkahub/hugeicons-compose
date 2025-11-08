package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Coordinate01: ImageVector
    get() {
        if (_coordinate01 != null) {
            return _coordinate01!!
        }
        _coordinate01 = ImageVector.Builder(
            name = "Coordinate01",
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
        moveTo(4.00781f, 4.99913f)
        curveTo(4.59743f, 4.39256f, 6.16671f, 2.00049f, 7.00666f, 2.00049f)
        curveTo(7.84661f, 2.00049f, 9.41589f, 4.39256f, 10.0055f, 4.99913f)
        moveTo(7.00666f, 2.84907f)
        verticalLineTo(21.9995f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.0023f, 13.995f)
        curveTo(19.6088f, 14.5846f, 22.0011f, 16.1538f, 22.0011f, 16.9937f)
        curveTo(22.0011f, 17.8336f, 19.6088f, 19.4028f, 19.0023f, 19.9923f)
        moveTo(21.1906f, 16.9939f)
        horizontalLineTo(1.99805f)
        }
        }.build()

        return _coordinate01!!
    }

private var _coordinate01: ImageVector? = null
