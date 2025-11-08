package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gears: ImageVector
    get() {
        if (_gears != null) {
            return _gears!!
        }
        _gears = ImageVector.Builder(
            name = "Gears",
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
        moveTo(9.37866f, 3.83307f)
        lineTo(9.21729f, 2.88021f)
        curveTo(9.14611f, 2.45991f, 9.11052f, 2.24976f, 8.95858f, 2.12488f)
        curveTo(8.80664f, 2f, 8.58655f, 2f, 8.14636f, 2f)
        horizontalLineTo(7.85617f)
        curveTo(7.41598f, 2f, 7.19589f, 2f, 7.04395f, 2.12488f)
        curveTo(6.89202f, 2.24976f, 6.85643f, 2.45991f, 6.78525f, 2.88021f)
        lineTo(6.62387f, 3.83307f)
        curveTo(6.28266f, 3.96639f, 5.96616f, 4.14778f, 5.68298f, 4.36874f)
        lineTo(4.7826f, 4.03678f)
        curveTo(4.3673f, 3.88367f, 4.15966f, 3.80712f, 3.97059f, 3.87291f)
        curveTo(3.78152f, 3.93869f, 3.67182f, 4.12567f, 3.45243f, 4.49963f)
        lineTo(3.29194f, 4.77319f)
        curveTo(3.07837f, 5.13722f, 2.97159f, 5.31924f, 3.00653f, 5.50636f)
        curveTo(3.04146f, 5.69349f, 3.20731f, 5.82785f, 3.53901f, 6.09658f)
        lineTo(4.30581f, 6.7178f)
        curveTo(4.28019f, 6.89156f, 4.26694f, 7.06926f, 4.26694f, 7.25f)
        curveTo(4.26694f, 7.4314f, 4.28029f, 7.60974f, 4.30609f, 7.7841f)
        lineTo(3.5411f, 8.40386f)
        curveTo(3.2094f, 8.67259f, 3.04355f, 8.80695f, 3.00861f, 8.99408f)
        curveTo(2.97367f, 9.1812f, 3.08046f, 9.36322f, 3.29402f, 9.72725f)
        lineTo(3.45451f, 10.0008f)
        curveTo(3.6739f, 10.3748f, 3.7836f, 10.5617f, 3.97267f, 10.6275f)
        curveTo(4.16174f, 10.6933f, 4.36939f, 10.6168f, 4.78468f, 10.4637f)
        lineTo(5.68403f, 10.1321f)
        curveTo(5.96694f, 10.3527f, 6.28308f, 10.5338f, 6.62387f, 10.6669f)
        lineTo(6.78524f, 11.6198f)
        curveTo(6.85643f, 12.0401f, 6.89202f, 12.2502f, 7.04395f, 12.3751f)
        curveTo(7.19589f, 12.5f, 7.41598f, 12.5f, 7.85617f, 12.5f)
        horizontalLineTo(8.14636f)
        curveTo(8.58655f, 12.5f, 8.80664f, 12.5f, 8.95858f, 12.3751f)
        curveTo(9.11051f, 12.2502f, 9.14611f, 12.0401f, 9.21729f, 11.6198f)
        lineTo(9.37866f, 10.6669f)
        curveTo(9.71912f, 10.5339f, 10.035f, 10.353f, 10.3177f, 10.1327f)
        lineTo(11.2153f, 10.4637f)
        curveTo(11.6306f, 10.6168f, 11.8383f, 10.6933f, 12.0273f, 10.6275f)
        curveTo(12.2164f, 10.5617f, 12.3261f, 10.3748f, 12.5455f, 10.0008f)
        lineTo(12.706f, 9.72725f)
        curveTo(12.9195f, 9.36322f, 13.0263f, 9.1812f, 12.9914f, 8.99408f)
        curveTo(12.9565f, 8.80695f, 12.7906f, 8.67259f, 12.4589f, 8.40386f)
        lineTo(11.6962f, 7.78593f)
        curveTo(11.7221f, 7.61099f, 11.7356f, 7.43204f, 11.7356f, 7.25f)
        curveTo(11.7356f, 7.06862f, 11.7222f, 6.89031f, 11.6965f, 6.71597f)
        lineTo(12.461f, 6.09658f)
        curveTo(12.7927f, 5.82785f, 12.9585f, 5.69349f, 12.9935f, 5.50636f)
        curveTo(13.0284f, 5.31924f, 12.9216f, 5.13722f, 12.7081f, 4.77319f)
        lineTo(12.5476f, 4.49963f)
        curveTo(12.3282f, 4.12567f, 12.2185f, 3.93869f, 12.0294f, 3.87291f)
        curveTo(11.8403f, 3.80712f, 11.6327f, 3.88367f, 11.2174f, 4.03678f)
        lineTo(10.3187f, 4.3681f)
        curveTo(10.0358f, 4.14743f, 9.71954f, 3.96626f, 9.37866f, 3.83307f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.3787f, 13.3331f)
        lineTo(17.2173f, 12.3802f)
        curveTo(17.1461f, 11.9599f, 17.1105f, 11.7498f, 16.9586f, 11.6249f)
        curveTo(16.8066f, 11.5f, 16.5866f, 11.5f, 16.1464f, 11.5f)
        horizontalLineTo(15.8562f)
        curveTo(15.416f, 11.5f, 15.1959f, 11.5f, 15.044f, 11.6249f)
        curveTo(14.892f, 11.7498f, 14.8564f, 11.9599f, 14.7852f, 12.3802f)
        lineTo(14.6239f, 13.3331f)
        curveTo(14.2827f, 13.4664f, 13.9662f, 13.6478f, 13.683f, 13.8687f)
        lineTo(12.7826f, 13.5368f)
        curveTo(12.3673f, 13.3837f, 12.1597f, 13.3071f, 11.9706f, 13.3729f)
        curveTo(11.7815f, 13.4387f, 11.6718f, 13.6257f, 11.4524f, 13.9996f)
        lineTo(11.2919f, 14.2732f)
        curveTo(11.0784f, 14.6372f, 10.9716f, 14.8192f, 11.0065f, 15.0064f)
        curveTo(11.0415f, 15.1935f, 11.2073f, 15.3279f, 11.539f, 15.5966f)
        lineTo(12.3058f, 16.2178f)
        curveTo(12.2802f, 16.3916f, 12.2669f, 16.5693f, 12.2669f, 16.75f)
        curveTo(12.2669f, 16.9314f, 12.2803f, 17.1097f, 12.3061f, 17.2841f)
        lineTo(11.5411f, 17.9039f)
        curveTo(11.2094f, 18.1726f, 11.0435f, 18.307f, 11.0086f, 18.4941f)
        curveTo(10.9737f, 18.6812f, 11.0805f, 18.8632f, 11.294f, 19.2272f)
        lineTo(11.4545f, 19.5008f)
        curveTo(11.6739f, 19.8748f, 11.7836f, 20.0617f, 11.9727f, 20.1275f)
        curveTo(12.1617f, 20.1933f, 12.3694f, 20.1168f, 12.7847f, 19.9637f)
        lineTo(13.684f, 19.6321f)
        curveTo(13.9669f, 19.8527f, 14.2831f, 20.0338f, 14.6239f, 20.1669f)
        lineTo(14.7852f, 21.1198f)
        curveTo(14.8564f, 21.5401f, 14.892f, 21.7502f, 15.044f, 21.8751f)
        curveTo(15.1959f, 22f, 15.416f, 22f, 15.8562f, 22f)
        horizontalLineTo(16.1464f)
        curveTo(16.5866f, 22f, 16.8066f, 22f, 16.9586f, 21.8751f)
        curveTo(17.1105f, 21.7502f, 17.1461f, 21.5401f, 17.2173f, 21.1198f)
        lineTo(17.3787f, 20.1669f)
        curveTo(17.7191f, 20.0339f, 18.035f, 19.853f, 18.3177f, 19.6327f)
        lineTo(19.2153f, 19.9637f)
        curveTo(19.6306f, 20.1168f, 19.8383f, 20.1933f, 20.0273f, 20.1275f)
        curveTo(20.2164f, 20.0617f, 20.3261f, 19.8748f, 20.5455f, 19.5008f)
        lineTo(20.706f, 19.2272f)
        curveTo(20.9195f, 18.8632f, 21.0263f, 18.6812f, 20.9914f, 18.4941f)
        curveTo(20.9565f, 18.307f, 20.7906f, 18.1726f, 20.4589f, 17.9039f)
        lineTo(19.6962f, 17.2859f)
        curveTo(19.7221f, 17.111f, 19.7356f, 16.932f, 19.7356f, 16.75f)
        curveTo(19.7356f, 16.5686f, 19.7222f, 16.3903f, 19.6965f, 16.216f)
        lineTo(20.461f, 15.5966f)
        curveTo(20.7927f, 15.3279f, 20.9585f, 15.1935f, 20.9935f, 15.0064f)
        curveTo(21.0284f, 14.8192f, 20.9216f, 14.6372f, 20.7081f, 14.2732f)
        lineTo(20.5476f, 13.9996f)
        curveTo(20.3282f, 13.6257f, 20.2185f, 13.4387f, 20.0294f, 13.3729f)
        curveTo(19.8403f, 13.3071f, 19.6327f, 13.3837f, 19.2174f, 13.5368f)
        lineTo(18.3187f, 13.8681f)
        curveTo(18.0358f, 13.6474f, 17.7195f, 13.4663f, 17.3787f, 13.3331f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.75f, 7.25f)
        curveTo(8.75f, 7.66421f, 8.41421f, 8f, 8f, 8f)
        curveTo(7.58579f, 8f, 7.25f, 7.66421f, 7.25f, 7.25f)
        curveTo(7.25f, 6.83579f, 7.58579f, 6.5f, 8f, 6.5f)
        curveTo(8.41421f, 6.5f, 8.75f, 6.83579f, 8.75f, 7.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.75f, 16.75f)
        curveTo(16.75f, 17.1642f, 16.4142f, 17.5f, 16f, 17.5f)
        curveTo(15.5858f, 17.5f, 15.25f, 17.1642f, 15.25f, 16.75f)
        curveTo(15.25f, 16.3358f, 15.5858f, 16f, 16f, 16f)
        curveTo(16.4142f, 16f, 16.75f, 16.3358f, 16.75f, 16.75f)
        }
        }.build()

        return _gears!!
    }

private var _gears: ImageVector? = null
