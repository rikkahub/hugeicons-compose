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

val HugeIcons.SignpostBig: ImageVector
    get() {
        if (_signpostBig != null) {
            return _signpostBig!!
        }
        _signpostBig = ImageVector.Builder(
            name = "SignpostBig",
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
            moveTo(15.2035f, 6f)
            horizontalLineTo(8.0016f)
            curveTo(6.59317f, 6f, 5.88896f, 6f, 5.38326f, 6.33706f)
            curveTo(5.16433f, 6.48298f, 4.97637f, 6.67048f, 4.83009f, 6.88886f)
            curveTo(4.49219f, 7.39331f, 4.49219f, 8.09554f, 4.49219f, 9.5f)
            curveTo(4.49219f, 10.9045f, 4.49219f, 11.6067f, 4.83009f, 12.1111f)
            curveTo(4.97637f, 12.3295f, 5.16433f, 12.517f, 5.38326f, 12.6629f)
            curveTo(5.88896f, 13f, 6.59293f, 13f, 8.00089f, 13f)
            horizontalLineTo(15.2037f)
            curveTo(15.7616f, 13f, 16.0405f, 13f, 16.3026f, 12.9278f)
            curveTo(16.4185f, 12.8958f, 16.5312f, 12.8536f, 16.6394f, 12.8015f)
            curveTo(16.8843f, 12.6837f, 17.0943f, 12.5005f, 17.5142f, 12.134f)
            curveTo(18.7092f, 11.091f, 19.3067f, 10.5695f, 19.4469f, 9.92277f)
            curveTo(19.5073f, 9.64414f, 19.5073f, 9.35586f, 19.4469f, 9.07723f)
            curveTo(19.3067f, 8.43054f, 18.7092f, 7.90902f, 17.5142f, 6.86598f)
            curveTo(17.0943f, 6.4995f, 16.8843f, 6.31626f, 16.6394f, 6.19847f)
            curveTo(16.5312f, 6.1464f, 16.4185f, 6.10415f, 16.3026f, 6.07222f)
            curveTo(16.0405f, 6f, 15.7615f, 6f, 15.2035f, 6f)
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
            moveTo(9.49219f, 6f)
            verticalLineTo(4.5f)
            curveTo(9.49219f, 4.03406f, 9.49219f, 3.80109f, 9.56831f, 3.61732f)
            curveTo(9.6698f, 3.37229f, 9.86448f, 3.17761f, 10.1095f, 3.07612f)
            curveTo(10.2933f, 3f, 10.5262f, 3f, 10.9922f, 3f)
            curveTo(11.4581f, 3f, 11.6911f, 3f, 11.8749f, 3.07612f)
            curveTo(12.1199f, 3.17761f, 12.3146f, 3.37229f, 12.4161f, 3.61732f)
            curveTo(12.4922f, 3.80109f, 12.4922f, 4.03406f, 12.4922f, 4.5f)
            verticalLineTo(6f)
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
            moveTo(9.49219f, 13f)
            verticalLineTo(19.5004f)
            curveTo(9.49219f, 19.9661f, 9.49219f, 20.1989f, 9.56831f, 20.3827f)
            curveTo(9.6698f, 20.6277f, 9.86448f, 20.8224f, 10.1095f, 20.9239f)
            curveTo(10.2933f, 21f, 10.5262f, 21f, 10.9922f, 21f)
            curveTo(11.4581f, 21f, 11.6911f, 21f, 11.8749f, 20.9239f)
            curveTo(12.1199f, 20.8224f, 12.3146f, 20.6277f, 12.4161f, 20.3827f)
            curveTo(12.4922f, 20.1989f, 12.4922f, 19.9659f, 12.4922f, 19.5f)
            verticalLineTo(13f)
        }
        }.build()

        return _signpostBig!!
    }

private var _signpostBig: ImageVector? = null
