package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ForgotPassword: ImageVector
    get() {
        if (_forgotPassword != null) {
            return _forgotPassword!!
        }
        _forgotPassword = ImageVector.Builder(
            name = "ForgotPassword",
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
        moveTo(15.395f, 21.9009f)
        curveTo(13.9836f, 21.966f, 12.5498f, 22f, 10.9709f, 22f)
        curveTo(9.39194f, 22f, 7.95815f, 21.966f, 6.5467f, 21.9009f)
        curveTo(4.8693f, 21.8235f, 3.4909f, 20.515f, 3.26684f, 18.8447f)
        curveTo(3.12061f, 17.7547f, 3f, 16.6376f, 3f, 15.5f)
        curveTo(3f, 14.3624f, 3.1206f, 13.2453f, 3.26684f, 12.1553f)
        curveTo(3.4909f, 10.485f, 4.8693f, 9.17649f, 6.5467f, 9.09909f)
        curveTo(7.95815f, 9.03397f, 9.39194f, 9f, 10.9709f, 9f)
        curveTo(12.5498f, 9f, 13.9836f, 9.03397f, 15.395f, 9.09909f)
        curveTo(16.4545f, 9.14798f, 17.3946f, 9.68796f, 18f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 14.978f)
        curveTo(17f, 13.8856f, 17.8954f, 13f, 19f, 13f)
        curveTo(20.1046f, 13f, 21f, 13.8856f, 21f, 14.978f)
        curveTo(21f, 15.3718f, 20.8837f, 15.7387f, 20.6831f, 16.0469f)
        curveTo(20.0854f, 16.9656f, 19f, 17.8416f, 19f, 18.9341f)
        verticalLineTo(19.4286f)
        moveTo(19f, 22f)
        horizontalLineTo(19.012f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 9f)
        verticalLineTo(6.5f)
        curveTo(6.5f, 4.01472f, 8.51472f, 2f, 11f, 2f)
        curveTo(13.4853f, 2f, 15.5f, 4.01472f, 15.5f, 6.5f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15.49f)
        verticalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15.49f)
        verticalLineTo(15.5f)
        }
        }.build()

        return _forgotPassword!!
    }

private var _forgotPassword: ImageVector? = null
