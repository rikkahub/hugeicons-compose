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

val HugeIcons.FolderUp: ImageVector
    get() {
        if (_folderUp != null) {
            return _folderUp!!
        }
        _folderUp = ImageVector.Builder(
            name = "FolderUp",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 7f)
            horizontalLineTo(16.75f)
            curveTo(18.8567f, 7f, 19.91f, 7f, 20.6667f, 7.50559f)
            curveTo(20.9943f, 7.72447f, 21.2755f, 8.00572f, 21.4944f, 8.33329f)
            curveTo(22f, 9.08996f, 22f, 10.1433f, 22f, 12.25f)
            curveTo(22f, 15.7612f, 22f, 17.5167f, 21.1573f, 18.7779f)
            curveTo(20.7926f, 19.3238f, 20.3238f, 19.7926f, 19.7779f, 20.1573f)
            curveTo(18.5167f, 21f, 16.7612f, 21f, 13.25f, 21f)
            horizontalLineTo(12f)
            curveTo(7.28595f, 21f, 4.92893f, 21f, 3.46447f, 19.5355f)
            curveTo(2f, 18.0711f, 2f, 15.714f, 2f, 11f)
            verticalLineTo(7.94427f)
            curveTo(2f, 6.1278f, 2f, 5.21956f, 2.38032f, 4.53806f)
            curveTo(2.65142f, 4.05227f, 3.05227f, 3.65142f, 3.53806f, 3.38032f)
            curveTo(4.21956f, 3f, 5.1278f, 3f, 6.94427f, 3f)
            curveTo(8.10802f, 3f, 8.6899f, 3f, 9.19926f, 3.19101f)
            curveTo(10.3622f, 3.62712f, 10.8418f, 4.68358f, 11.3666f, 5.73313f)
            lineTo(12f, 7f)
        }

        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.7539f, 11.9995f)
            curveTo(12.7539f, 11.5853f, 12.4181f, 11.2495f, 12.0039f, 11.2495f)
            curveTo(11.5897f, 11.2495f, 11.2539f, 11.5853f, 11.2539f, 11.9995f)
            lineTo(12.0039f, 11.9995f)
            lineTo(12.7539f, 11.9995f)
            close()
            moveTo(11.2539f, 16.9995f)
            curveTo(11.2539f, 17.4137f, 11.5897f, 17.7495f, 12.0039f, 17.7495f)
            curveTo(12.4181f, 17.7495f, 12.7539f, 17.4137f, 12.7539f, 16.9995f)
            horizontalLineTo(12.0039f)
            horizontalLineTo(11.2539f)
            close()
            moveTo(12.0039f, 10.9995f)
            lineTo(12.0039f, 10.2495f)
            lineTo(12.0039f, 10.9995f)
            close()
            moveTo(8.40001f, 13.5547f)
            curveTo(8.15438f, 13.8882f, 8.22562f, 14.3577f, 8.55914f, 14.6034f)
            curveTo(8.89266f, 14.849f, 9.36216f, 14.7778f, 9.6078f, 14.4443f)
            lineTo(9.00391f, 13.9995f)
            lineTo(8.40001f, 13.5547f)
            close()
            moveTo(14.4f, 14.4443f)
            curveTo(14.6456f, 14.7778f, 15.1151f, 14.849f, 15.4487f, 14.6034f)
            curveTo(15.7822f, 14.3578f, 15.8534f, 13.8883f, 15.6078f, 13.5548f)
            lineTo(15.0039f, 13.9995f)
            lineTo(14.4f, 14.4443f)
            close()
            moveTo(12.0039f, 11.9995f)
            lineTo(11.2539f, 11.9995f)
            lineTo(11.2539f, 16.9995f)
            horizontalLineTo(12.0039f)
            horizontalLineTo(12.7539f)
            lineTo(12.7539f, 11.9995f)
            lineTo(12.0039f, 11.9995f)
            close()
            moveTo(12.0039f, 10.9995f)
            lineTo(12.0039f, 10.2495f)
            curveTo(11.6962f, 10.2495f, 11.4303f, 10.3839f, 11.2608f, 10.4861f)
            curveTo(11.0707f, 10.6007f, 10.8816f, 10.7502f, 10.7051f, 10.9062f)
            curveTo(10.3502f, 11.2197f, 9.97487f, 11.6234f, 9.64114f, 12.0078f)
            curveTo(9.30417f, 12.3959f, 8.99462f, 12.7818f, 8.77023f, 13.0693f)
            curveTo(8.65772f, 13.2135f, 8.56591f, 13.3338f, 8.50192f, 13.4185f)
            curveTo(8.46991f, 13.4609f, 8.44483f, 13.4944f, 8.42755f, 13.5176f)
            curveTo(8.41892f, 13.5292f, 8.41223f, 13.5382f, 8.4076f, 13.5445f)
            curveTo(8.40529f, 13.5476f, 8.40349f, 13.55f, 8.40222f, 13.5517f)
            curveTo(8.40159f, 13.5526f, 8.40109f, 13.5533f, 8.40072f, 13.5538f)
            curveTo(8.40053f, 13.554f, 8.40038f, 13.5542f, 8.40026f, 13.5544f)
            curveTo(8.40021f, 13.5545f, 8.40014f, 13.5545f, 8.40011f, 13.5546f)
            curveTo(8.40006f, 13.5547f, 8.40001f, 13.5547f, 9.00391f, 13.9995f)
            curveTo(9.6078f, 14.4443f, 9.60777f, 14.4443f, 9.60775f, 14.4443f)
            curveTo(9.60775f, 14.4443f, 9.60774f, 14.4443f, 9.60775f, 14.4443f)
            curveTo(9.60777f, 14.4443f, 9.60782f, 14.4442f, 9.6079f, 14.4441f)
            curveTo(9.60807f, 14.4439f, 9.60837f, 14.4435f, 9.6088f, 14.4429f)
            curveTo(9.60966f, 14.4417f, 9.61104f, 14.4399f, 9.61293f, 14.4373f)
            curveTo(9.61672f, 14.4322f, 9.62253f, 14.4244f, 9.63027f, 14.414f)
            curveTo(9.64575f, 14.3932f, 9.66891f, 14.3623f, 9.69886f, 14.3226f)
            curveTo(9.75879f, 14.2433f, 9.84576f, 14.1293f, 9.95275f, 13.9922f)
            curveTo(10.1673f, 13.7172f, 10.4596f, 13.3531f, 10.7738f, 12.9912f)
            curveTo(11.0912f, 12.6256f, 11.4165f, 12.2793f, 11.6983f, 12.0303f)
            curveTo(11.84f, 11.905f, 11.9532f, 11.8202f, 12.0353f, 11.7707f)
            curveTo(12.1379f, 11.7089f, 12.114f, 11.7495f, 12.0039f, 11.7495f)
            lineTo(12.0039f, 10.9995f)
            close()
            moveTo(15.0039f, 13.9995f)
            curveTo(15.6078f, 13.5548f, 15.6078f, 13.5547f, 15.6077f, 13.5546f)
            curveTo(15.6077f, 13.5546f, 15.6076f, 13.5545f, 15.6076f, 13.5544f)
            curveTo(15.6074f, 13.5543f, 15.6073f, 13.5541f, 15.6071f, 13.5538f)
            curveTo(15.6067f, 13.5533f, 15.6062f, 13.5526f, 15.6056f, 13.5518f)
            curveTo(15.6043f, 13.55f, 15.6025f, 13.5476f, 15.6002f, 13.5445f)
            curveTo(15.5956f, 13.5382f, 15.5889f, 13.5292f, 15.5803f, 13.5176f)
            curveTo(15.563f, 13.4945f, 15.5379f, 13.461f, 15.5059f, 13.4186f)
            curveTo(15.4419f, 13.3339f, 15.3501f, 13.2135f, 15.2376f, 13.0693f)
            curveTo(15.0132f, 12.7818f, 14.7037f, 12.3959f, 14.3667f, 12.0078f)
            curveTo(14.033f, 11.6234f, 13.6576f, 11.2197f, 13.3028f, 10.9062f)
            curveTo(13.1263f, 10.7502f, 12.9371f, 10.6007f, 12.747f, 10.4861f)
            curveTo(12.5775f, 10.3839f, 12.3116f, 10.2495f, 12.0039f, 10.2495f)
            lineTo(12.0039f, 10.9995f)
            lineTo(12.0039f, 11.7495f)
            curveTo(11.8939f, 11.7495f, 11.87f, 11.7089f, 11.9726f, 11.7707f)
            curveTo(12.0547f, 11.8202f, 12.1678f, 11.905f, 12.3096f, 12.0303f)
            curveTo(12.5914f, 12.2793f, 12.9166f, 12.6256f, 13.234f, 12.9912f)
            curveTo(13.5483f, 13.3531f, 13.8405f, 13.7172f, 14.0551f, 13.9922f)
            curveTo(14.162f, 14.1293f, 14.249f, 14.2433f, 14.309f, 14.3226f)
            curveTo(14.3389f, 14.3623f, 14.3621f, 14.3932f, 14.3775f, 14.414f)
            curveTo(14.3853f, 14.4244f, 14.3911f, 14.4322f, 14.3949f, 14.4373f)
            curveTo(14.3968f, 14.4399f, 14.3981f, 14.4417f, 14.399f, 14.4429f)
            curveTo(14.3994f, 14.4435f, 14.3997f, 14.4439f, 14.3999f, 14.4441f)
            curveTo(14.4f, 14.4442f, 14.4f, 14.4443f, 14.4001f, 14.4443f)
            curveTo(14.4001f, 14.4443f, 14.4001f, 14.4443f, 14.4001f, 14.4443f)
            curveTo(14.4f, 14.4443f, 14.4f, 14.4443f, 15.0039f, 13.9995f)
            close()
        }
        }.build()

        return _folderUp!!
    }

private var _folderUp: ImageVector? = null
