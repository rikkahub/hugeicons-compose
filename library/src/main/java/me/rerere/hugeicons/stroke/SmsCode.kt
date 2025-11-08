package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SmsCode: ImageVector
    get() {
        if (_smsCode != null) {
            return _smsCode!!
        }
        _smsCode = ImageVector.Builder(
            name = "SmsCode",
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
        moveTo(18.6436f, 4f)
        curveTo(18.4955f, 3.61742f, 18.2933f, 3.29898f, 18.0175f, 3.02513f)
        curveTo(16.9851f, 2f, 15.3234f, 2f, 12f, 2f)
        curveTo(8.67661f, 2f, 7.01491f, 2f, 5.98247f, 3.02513f)
        curveTo(5.70666f, 3.29898f, 5.50453f, 3.61742f, 5.3564f, 4f)
        moveTo(5f, 18f)
        curveTo(5.08715f, 19.4194f, 5.32629f, 20.3233f, 5.98247f, 20.9749f)
        curveTo(7.01491f, 22f, 8.67661f, 22f, 12f, 22f)
        curveTo(15.3234f, 22f, 16.9851f, 22f, 18.0175f, 20.9749f)
        curveTo(18.6737f, 20.3233f, 18.9128f, 19.4194f, 19f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 10f)
        lineTo(8f, 12f)
        moveTo(8f, 10f)
        lineTo(6f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 10f)
        lineTo(13f, 12f)
        moveTo(13f, 10f)
        lineTo(11f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 10f)
        lineTo(18f, 12f)
        moveTo(18f, 10f)
        lineTo(16f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 7f)
        horizontalLineTo(7f)
        curveTo(5.11438f, 7f, 4.17157f, 7f, 3.58579f, 7.58579f)
        curveTo(3f, 8.17157f, 3f, 9.11438f, 3f, 11f)
        curveTo(3f, 12.8856f, 3f, 13.8284f, 3.58579f, 14.4142f)
        curveTo(4.17157f, 15f, 5.11438f, 15f, 7f, 15f)
        horizontalLineTo(17f)
        curveTo(18.8856f, 15f, 19.8284f, 15f, 20.4142f, 14.4142f)
        curveTo(21f, 13.8284f, 21f, 12.8856f, 21f, 11f)
        curveTo(21f, 9.11438f, 21f, 8.17157f, 20.4142f, 7.58579f)
        curveTo(19.8284f, 7f, 18.8856f, 7f, 17f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        verticalLineTo(19.01f)
        }
        }.build()

        return _smsCode!!
    }

private var _smsCode: ImageVector? = null
