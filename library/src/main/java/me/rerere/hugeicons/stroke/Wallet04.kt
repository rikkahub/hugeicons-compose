package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wallet04: ImageVector
    get() {
        if (_wallet04 != null) {
            return _wallet04!!
        }
        _wallet04 = ImageVector.Builder(
            name = "Wallet04",
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
        moveTo(3f, 8.5f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 8.5f, 19.2426f, 8.5f, 20.1213f, 9.37868f)
        curveTo(21f, 10.2574f, 21f, 11.6716f, 21f, 14.5f)
        verticalLineTo(15.5f)
        curveTo(21f, 18.3284f, 21f, 19.7426f, 20.1213f, 20.6213f)
        curveTo(19.2426f, 21.5f, 17.8284f, 21.5f, 15f, 21.5f)
        horizontalLineTo(9f)
        curveTo(6.17157f, 21.5f, 4.75736f, 21.5f, 3.87868f, 20.6213f)
        curveTo(3f, 19.7426f, 3f, 18.3284f, 3f, 15.5f)
        verticalLineTo(8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8.49833f)
        verticalLineTo(4.1103f)
        curveTo(15f, 3.22096f, 14.279f, 2.5f, 13.3897f, 2.5f)
        curveTo(13.1336f, 2.5f, 12.8812f, 2.56108f, 12.6534f, 2.67818f)
        lineTo(3.7623f, 7.24927f)
        curveTo(3.29424f, 7.48991f, 3f, 7.97203f, 3f, 8.49833f)
        }
        }.build()

        return _wallet04!!
    }

private var _wallet04: ImageVector? = null
