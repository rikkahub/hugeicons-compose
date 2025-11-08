package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LoginCircle02: ImageVector
    get() {
        if (_loginCircle02 != null) {
            return _loginCircle02!!
        }
        _loginCircle02 = ImageVector.Builder(
            name = "LoginCircle02",
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
        moveTo(12f, 21f)
        curveTo(7.02944f, 21f, 3f, 16.9706f, 3f, 12f)
        curveTo(3f, 7.02944f, 7.02944f, 3f, 12f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 8f)
        curveTo(13f, 8f, 9.00001f, 10.946f, 9f, 12f)
        curveTo(8.99999f, 13.0541f, 13f, 16f, 13f, 16f)
        moveTo(9.5f, 12f)
        horizontalLineTo(21f)
        }
        }.build()

        return _loginCircle02!!
    }

private var _loginCircle02: ImageVector? = null
