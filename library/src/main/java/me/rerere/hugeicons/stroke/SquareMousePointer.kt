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

val HugeIcons.SquareMousePointer: ImageVector
    get() {
        if (_squareMousePointer != null) {
            return _squareMousePointer!!
        }
        _squareMousePointer = ImageVector.Builder(
            name = "SquareMousePointer",
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
            moveTo(9.5f, 20.5f)
            curveTo(7.16825f, 20.5f, 6.00237f, 20.5f, 5.09822f, 20.0784f)
            curveTo(4.13938f, 19.6313f, 3.36873f, 18.8606f, 2.92162f, 17.9018f)
            curveTo(2.5f, 16.9976f, 2.5f, 15.8318f, 2.5f, 13.5f)
            verticalLineTo(11.5f)
            curveTo(2.5f, 7.25736f, 2.5f, 5.13604f, 3.81802f, 3.81802f)
            curveTo(5.13604f, 2.5f, 7.25736f, 2.5f, 11.5f, 2.5f)
            horizontalLineTo(13.5f)
            curveTo(15.8318f, 2.5f, 16.9976f, 2.5f, 17.9018f, 2.92161f)
            curveTo(18.8606f, 3.36873f, 19.6313f, 4.13938f, 20.0784f, 5.09822f)
            curveTo(20.5f, 6.00237f, 20.5f, 7.16825f, 20.5f, 9.5f)
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
            moveTo(13.0413f, 19.3047f)
            lineTo(11.2487f, 14.1552f)
            curveTo(10.5746f, 12.2186f, 10.2375f, 11.2502f, 10.7442f, 10.744f)
            curveTo(11.2508f, 10.2377f, 12.2199f, 10.5745f, 14.158f, 11.2481f)
            lineTo(19.3009f, 13.0356f)
            curveTo(20.376f, 13.4092f, 20.9136f, 13.5961f, 21.0296f, 13.9579f)
            curveTo(21.0616f, 14.0577f, 21.0726f, 14.163f, 21.062f, 14.2672f)
            curveTo(21.0235f, 14.6452f, 20.5364f, 14.9393f, 19.5621f, 15.5274f)
            curveTo(19.2913f, 15.6909f, 19.0792f, 15.8189f, 18.919f, 15.9347f)
            curveTo(18.794f, 16.0251f, 18.7315f, 16.0702f, 18.7131f, 16.3004f)
            curveTo(18.6947f, 16.5305f, 18.7834f, 16.6193f, 18.9609f, 16.7967f)
            lineTo(21.0884f, 18.9242f)
            curveTo(21.3519f, 19.1878f, 21.5f, 19.5452f, 21.5f, 19.9179f)
            curveTo(21.5f, 20.2906f, 21.3519f, 20.6481f, 21.0884f, 20.9116f)
            lineTo(20.9223f, 21.0777f)
            curveTo(20.6519f, 21.3481f, 20.2852f, 21.5f, 19.9028f, 21.5f)
            curveTo(19.5205f, 21.5f, 19.1538f, 21.3481f, 18.8834f, 21.0777f)
            lineTo(16.7835f, 18.9778f)
            curveTo(16.6042f, 18.7985f, 16.5146f, 18.7089f, 16.2836f, 18.7281f)
            curveTo(16.0525f, 18.7474f, 16.0067f, 18.8116f, 15.9151f, 18.94f)
            curveTo(15.8033f, 19.0968f, 15.6794f, 19.3023f, 15.5224f, 19.5628f)
            curveTo(14.9415f, 20.5262f, 14.6511f, 21.0079f, 14.2783f, 21.0503f)
            curveTo(14.1684f, 21.0628f, 14.057f, 21.0512f, 13.952f, 21.0164f)
            curveTo(13.5959f, 20.8982f, 13.4111f, 20.367f, 13.0413f, 19.3047f)
            close()
        }
        }.build()

        return _squareMousePointer!!
    }

private var _squareMousePointer: ImageVector? = null
