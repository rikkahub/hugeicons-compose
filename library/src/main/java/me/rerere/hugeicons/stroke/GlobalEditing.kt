package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GlobalEditing: ImageVector
    get() {
        if (_globalEditing != null) {
            return _globalEditing!!
        }
        _globalEditing = ImageVector.Builder(
            name = "GlobalEditing",
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
        moveTo(10.0775f, 22.0001f)
        curveTo(5.46844f, 21.0622f, 2f, 16.9869f, 2f, 12.1016f)
        curveTo(2f, 6.52267f, 6.5233f, 2.00006f, 12.1031f, 2.00006f)
        curveTo(16.9838f, 2.00006f, 21.0562f, 5.46049f, 22f, 10.0614f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.4332f, 13.8485f)
        curveTo(18.7685f, 13.4852f, 18.9362f, 13.3035f, 19.1143f, 13.1976f)
        curveTo(19.5442f, 12.9419f, 20.0736f, 12.934f, 20.5107f, 13.1766f)
        curveTo(20.6918f, 13.2772f, 20.8646f, 13.4537f, 21.2103f, 13.8068f)
        curveTo(21.5559f, 14.1599f, 21.7287f, 14.3364f, 21.8272f, 14.5215f)
        curveTo(22.0647f, 14.968f, 22.0569f, 15.5087f, 21.8066f, 15.9479f)
        curveTo(21.7029f, 16.1299f, 21.5251f, 16.3012f, 21.1694f, 16.6437f)
        lineTo(16.9378f, 20.7195f)
        curveTo(16.2638f, 21.3687f, 15.9268f, 21.6932f, 15.5056f, 21.8577f)
        curveTo(15.0845f, 22.0222f, 14.6214f, 22.0101f, 13.6954f, 21.9859f)
        lineTo(13.5694f, 21.9826f)
        curveTo(13.2875f, 21.9753f, 13.1466f, 21.9716f, 13.0646f, 21.8786f)
        curveTo(12.9827f, 21.7856f, 12.9939f, 21.642f, 13.0162f, 21.3548f)
        lineTo(13.0284f, 21.1989f)
        curveTo(13.0914f, 20.3907f, 13.1228f, 19.9865f, 13.2807f, 19.6233f)
        curveTo(13.4385f, 19.26f, 13.7107f, 18.965f, 14.2552f, 18.3751f)
        lineTo(18.4332f, 13.8485f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 5.69905f)
        curveTo(19.0653f, 5.76642f, 17.8681f, 6.1283f, 17.0379f, 7.20283f)
        curveTo(15.5385f, 9.14367f, 14.039f, 9.30562f, 13.0394f, 8.65867f)
        curveTo(11.5399f, 7.68826f, 12.8f, 6.11642f, 11.0401f, 5.26221f)
        curveTo(9.89313f, 4.70548f, 9.73321f, 3.19051f, 10.3716f, 2.00006f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 11.0001f)
        curveTo(2.7625f, 11.6622f, 3.83046f, 12.2683f, 5.08874f, 12.2683f)
        curveTo(7.68843f, 12.2683f, 8.20837f, 12.765f, 8.20837f, 14.7519f)
        curveTo(8.20837f, 16.7387f, 8.20837f, 16.7387f, 8.72831f, 18.2289f)
        curveTo(9.06651f, 19.1982f, 9.18472f, 20.1675f, 8.5106f, 21.0001f)
        }
        }.build()

        return _globalEditing!!
    }

private var _globalEditing: ImageVector? = null
