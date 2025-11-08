package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LoginCircle01: ImageVector
    get() {
        if (_loginCircle01 != null) {
            return _loginCircle01!!
        }
        _loginCircle01 = ImageVector.Builder(
            name = "LoginCircle01",
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
        moveTo(3.00006f, 7.63576f)
        curveTo(4.6208f, 4.29965f, 8.04185f, 2f, 12f, 2f)
        curveTo(17.5229f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 17.5228f, 17.5229f, 22f, 12f, 22f)
        curveTo(8.04185f, 22f, 4.6208f, 19.7004f, 3.00006f, 16.3642f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 8f)
        curveTo(11f, 8f, 15f, 10.946f, 15f, 12f)
        curveTo(15f, 13.0541f, 11f, 16f, 11f, 16f)
        moveTo(14.5f, 12f)
        horizontalLineTo(2f)
        }
        }.build()

        return _loginCircle01!!
    }

private var _loginCircle01: ImageVector? = null
