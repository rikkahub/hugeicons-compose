package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Radiation: ImageVector
    get() {
        if (_radiation != null) {
            return _radiation!!
        }
        _radiation = ImageVector.Builder(
            name = "Radiation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.8766f, 10.1531f)
            curveTo(15.6924f, 9.42955f, 15.3109f, 8.78476f, 14.7928f, 8.2794f)
            curveTo(14.3976f, 7.89385f, 14.2219f, 7.28948f, 14.498f, 6.8113f)
            lineTo(16.4983f, 3.34665f)
            curveTo(16.7746f, 2.86813f, 17.3902f, 2.7005f, 17.8385f, 3.02346f)
            curveTo(20.105f, 4.65609f, 21.6603f, 7.2143f, 21.9508f, 10.1445f)
            curveTo(22.0053f, 10.6941f, 21.5523f, 11.143f, 21f, 11.143f)
            horizontalLineTo(17f)
            curveTo(16.4477f, 11.143f, 16.0128f, 10.6883f, 15.8766f, 10.1531f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.2017f, 8.28473f)
            curveTo(8.6864f, 8.7893f, 8.30697f, 9.43209f, 8.12342f, 10.1531f)
            curveTo(7.98716f, 10.6883f, 7.55228f, 11.143f, 6.99999f, 11.143f)
            horizontalLineTo(2.99999f)
            curveTo(2.44771f, 11.143f, 1.99474f, 10.6941f, 2.04922f, 10.1445f)
            curveTo(2.33932f, 7.21821f, 3.89085f, 4.66292f, 6.1524f, 3.03001f)
            curveTo(6.60071f, 2.70631f, 7.2169f, 2.87376f, 7.49337f, 3.35263f)
            lineTo(9.49445f, 6.8186f)
            curveTo(9.77003f, 7.29592f, 9.59552f, 7.89913f, 9.2017f, 8.28473f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.88499f, 20.2598f)
            curveTo(9.14003f, 20.8272f, 10.5331f, 21.143f, 12f, 21.143f)
            curveTo(13.4629f, 21.143f, 14.8524f, 20.8289f, 16.1048f, 20.2644f)
            curveTo(16.6082f, 20.0375f, 16.7704f, 19.4209f, 16.4943f, 18.9426f)
            lineTo(14.4932f, 15.4767f)
            curveTo(14.2172f, 14.9987f, 13.6066f, 14.8489f, 13.0749f, 14.9969f)
            curveTo(12.7328f, 15.0921f, 12.3724f, 15.143f, 12f, 15.143f)
            curveTo(11.625f, 15.143f, 11.262f, 15.0914f, 10.9178f, 14.9949f)
            curveTo(10.3854f, 14.8456f, 9.77316f, 14.995f, 9.49672f, 15.4738f)
            lineTo(7.49641f, 18.9384f)
            curveTo(7.22049f, 19.4163f, 7.38216f, 20.0325f, 7.88499f, 20.2598f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 10.9547f)
            verticalLineTo(11.1422f)
            moveTo(12.25f, 11.1422f)
            curveTo(12.25f, 11.2802f, 12.1381f, 11.3922f, 12f, 11.3922f)
            curveTo(11.8619f, 11.3922f, 11.75f, 11.2802f, 11.75f, 11.1422f)
            curveTo(11.75f, 11.0041f, 11.8619f, 10.8922f, 12f, 10.8922f)
            curveTo(12.1381f, 10.8922f, 12.25f, 11.0041f, 12.25f, 11.1422f)
            close()
        }
        }.build()

        return _radiation!!
    }

private var _radiation: ImageVector? = null
