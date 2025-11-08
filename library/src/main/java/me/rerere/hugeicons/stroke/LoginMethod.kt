package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LoginMethod: ImageVector
    get() {
        if (_loginMethod != null) {
            return _loginMethod!!
        }
        _loginMethod = ImageVector.Builder(
            name = "LoginMethod",
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
        moveTo(13.5f, 7f)
        horizontalLineTo(10.5f)
        curveTo(8.61438f, 7f, 7.67157f, 7f, 7.08579f, 7.58579f)
        curveTo(6.5f, 8.17157f, 6.5f, 9.11438f, 6.5f, 11f)
        verticalLineTo(11.5f)
        curveTo(6.5f, 13.3856f, 6.5f, 14.3284f, 7.08579f, 14.9142f)
        curveTo(7.67157f, 15.5f, 8.61438f, 15.5f, 10.5f, 15.5f)
        horizontalLineTo(13.5f)
        curveTo(15.3856f, 15.5f, 16.3284f, 15.5f, 16.9142f, 14.9142f)
        curveTo(17.5f, 14.3284f, 17.5f, 13.3856f, 17.5f, 11.5f)
        verticalLineTo(11f)
        curveTo(17.5f, 9.11438f, 17.5f, 8.17157f, 16.9142f, 7.58579f)
        curveTo(16.3284f, 7f, 15.3856f, 7f, 13.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 7f)
        verticalLineTo(5f)
        curveTo(9f, 3.34315f, 10.3431f, 2f, 12f, 2f)
        curveTo(13.6569f, 2f, 15f, 3.34315f, 15f, 5f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 19f)
        lineTo(10.5f, 22f)
        moveTo(10.5f, 19f)
        lineTo(13.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 19f)
        lineTo(18f, 22f)
        moveTo(18f, 19f)
        lineTo(21f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 19f)
        lineTo(3f, 22f)
        moveTo(3f, 19f)
        lineTo(6f, 22f)
        }
        }.build()

        return _loginMethod!!
    }

private var _loginMethod: ImageVector? = null
