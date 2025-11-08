package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShieldEnergy: ImageVector
    get() {
        if (_shieldEnergy != null) {
            return _shieldEnergy!!
        }
        _shieldEnergy = ImageVector.Builder(
            name = "ShieldEnergy",
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
        moveTo(8.12901f, 11.1313f)
        lineTo(12.128f, 6.1907f)
        curveTo(12.4408f, 5.80431f, 13.027f, 6.0448f, 13.027f, 6.55951f)
        verticalLineTo(10.3836f)
        curveTo(13.027f, 10.6919f, 13.2569f, 10.9419f, 13.5405f, 10.9419f)
        horizontalLineTo(15.4855f)
        curveTo(15.9274f, 10.9419f, 16.1629f, 11.5083f, 15.871f, 11.8689f)
        lineTo(11.872f, 16.8095f)
        curveTo(11.5592f, 17.1959f, 10.973f, 16.9554f, 10.973f, 16.4407f)
        verticalLineTo(12.6167f)
        curveTo(10.973f, 12.3083f, 10.7431f, 12.0584f, 10.4595f, 12.0584f)
        horizontalLineTo(8.51449f)
        curveTo(8.07264f, 12.0584f, 7.83711f, 11.4919f, 8.12901f, 11.1313f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 11.1835f)
        verticalLineTo(8.28041f)
        curveTo(21f, 6.64041f, 21f, 5.82041f, 20.5959f, 5.28541f)
        curveTo(20.1918f, 4.75042f, 19.2781f, 4.49068f, 17.4507f, 3.97122f)
        curveTo(16.2022f, 3.61632f, 15.1016f, 3.18875f, 14.2223f, 2.79841f)
        curveTo(13.0234f, 2.26622f, 12.424f, 2.00012f, 12f, 2.00012f)
        curveTo(11.576f, 2.00012f, 10.9766f, 2.26622f, 9.77771f, 2.79841f)
        curveTo(8.89839f, 3.18875f, 7.79784f, 3.61632f, 6.54933f, 3.97122f)
        curveTo(4.72193f, 4.49068f, 3.80822f, 4.75042f, 3.40411f, 5.28541f)
        curveTo(3f, 5.82041f, 3f, 6.64041f, 3f, 8.28041f)
        verticalLineTo(11.1835f)
        curveTo(3f, 16.8086f, 8.06277f, 20.1836f, 10.594f, 21.5195f)
        curveTo(11.2011f, 21.8399f, 11.5046f, 22.0001f, 12f, 22.0001f)
        curveTo(12.4954f, 22.0001f, 12.7989f, 21.8399f, 13.406f, 21.5195f)
        curveTo(15.9372f, 20.1836f, 21f, 16.8086f, 21f, 11.1835f)
        }
        }.build()

        return _shieldEnergy!!
    }

private var _shieldEnergy: ImageVector? = null
