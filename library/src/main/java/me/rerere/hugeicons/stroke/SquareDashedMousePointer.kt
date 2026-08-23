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

val HugeIcons.SquareDashedMousePointer: ImageVector
    get() {
        if (_squareDashedMousePointer != null) {
            return _squareDashedMousePointer!!
        }
        _squareDashedMousePointer = ImageVector.Builder(
            name = "SquareDashedMousePointer",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.5274f, 11.0865f)
            lineTo(18.5497f, 12.6605f)
            curveTo(20.8697f, 13.5683f, 22.0297f, 14.0222f, 21.9913f, 14.7422f)
            curveTo(21.9528f, 15.4622f, 20.7422f, 15.7924f, 18.321f, 16.4527f)
            curveTo(17.6001f, 16.6493f, 17.2397f, 16.7476f, 16.9897f, 16.9976f)
            curveTo(16.7398f, 17.2475f, 16.6415f, 17.6079f, 16.4449f, 18.3288f)
            curveTo(15.7846f, 20.75f, 15.4544f, 21.9606f, 14.7344f, 21.9991f)
            curveTo(14.0144f, 22.0375f, 13.5605f, 20.8775f, 12.6526f, 18.5575f)
            lineTo(11.0787f, 14.5352f)
            curveTo(10.1282f, 12.1062f, 9.65299f, 10.8918f, 10.2685f, 10.2763f)
            curveTo(10.8839f, 9.6608f, 12.0984f, 10.136f, 14.5274f, 11.0865f)
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
            moveTo(10.4922f, 20.995f)
            curveTo(9.80835f, 20.995f, 9.59234f, 20.995f, 9.59234f, 20.995f)
            moveTo(5.79219f, 2.25143f)
            curveTo(4.75295f, 2.44471f, 3.9881f, 2.78657f, 3.38343f, 3.39124f)
            curveTo(2.77876f, 3.99591f, 2.43689f, 4.76076f, 2.24361f, 5.8f)
            moveTo(17.1922f, 2.25143f)
            curveTo(18.2314f, 2.44471f, 18.9963f, 2.78657f, 19.6009f, 3.39124f)
            curveTo(20.2056f, 3.99591f, 20.5475f, 4.76076f, 20.7408f, 5.8f)
            moveTo(13.3922f, 2.00495f)
            curveTo(12.8078f, 2f, 12.1761f, 2f, 11.4922f, 2f)
            curveTo(10.8083f, 2f, 10.1766f, 2f, 9.59217f, 2.00495f)
            moveTo(1.99714f, 9.6f)
            curveTo(1.99219f, 10.1844f, 1.99219f, 10.8161f, 1.99219f, 11.5f)
            curveTo(1.99219f, 12.1839f, 1.99219f, 12.8156f, 1.99714f, 13.4001f)
            moveTo(2.24361f, 17.2f)
            curveTo(2.43689f, 18.2392f, 2.77876f, 19.0041f, 3.38343f, 19.6088f)
            curveTo(3.9881f, 20.2134f, 4.75295f, 20.5553f, 5.79219f, 20.7486f)
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
            moveTo(20.9883f, 10.5f)
            verticalLineTo(9.59961f)
        }
        }.build()

        return _squareDashedMousePointer!!
    }

private var _squareDashedMousePointer: ImageVector? = null
