package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sujood: ImageVector
    get() {
        if (_sujood != null) {
            return _sujood!!
        }
        _sujood = ImageVector.Builder(
            name = "Sujood",
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
        moveTo(19.5f, 12.5107f)
        curveTo(19.5f, 11.0269f, 18.6112f, 8.56411f, 15.0561f, 6.5857f)
        curveTo(10.6122f, 4.11268f, 7.31475f, 4.86323f, 6.16835f, 6.5857f)
        curveTo(5.1808f, 8.06949f, 4.68705f, 10.0479f, 9.13094f, 14.9939f)
        horizontalLineTo(7.49878f)
        curveTo(6.55716f, 14.9939f, 6.08499f, 14.9953f, 5.79222f, 15.2875f)
        curveTo(5.5f, 15.5802f, 5.5f, 16.0511f, 5.5f, 16.9927f)
        curveTo(5.5f, 17.9343f, 5.5f, 18.4051f, 5.79222f, 18.6979f)
        curveTo(6.08499f, 18.9901f, 6.55716f, 18.9915f, 7.49878f, 18.9915f)
        horizontalLineTo(9.5f)
        curveTo(10.665f, 19.069f, 12.9951f, 18.6512f, 12.9951f, 16.3595f)
        moveTo(19.5f, 12.5107f)
        curveTo(19f, 12.8337f, 17.5f, 14.382f, 15.5f, 13.9945f)
        lineTo(16.5f, 16.493f)
        curveTo(17.1667f, 16.6596f, 18.6f, 17.7922f, 19f, 18.9915f)
        horizontalLineTo(15.6606f)
        curveTo(14.9429f, 18.9915f, 14.2802f, 18.6071f, 13.9242f, 17.9844f)
        lineTo(12.9951f, 16.3595f)
        moveTo(19.5f, 12.5107f)
        horizontalLineTo(19.7577f)
        curveTo(21.2722f, 12.5107f, 22.5f, 13.7378f, 22.5f, 15.2514f)
        curveTo(22.5f, 16.765f, 21.2722f, 17.9921f, 19.7577f, 17.9921f)
        horizontalLineTo(18.5f)
        moveTo(15.0561f, 10.4966f)
        curveTo(14.2099f, 10.4966f, 13.1934f, 10.7926f, 12.3021f, 11.1429f)
        curveTo(11.2757f, 11.5463f, 10.943f, 12.7705f, 11.4902f, 13.7275f)
        lineTo(12.9951f, 16.3595f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5001f, 15.5f)
        curveTo(4.49881f, 15.5f, 3.29726f, 14f, 2.49623f, 14f)
        curveTo(1.66898f, 14f, 1.52519f, 14.3413f, 1.50019f, 16.9976f)
        curveTo(1.4898f, 18.1021f, 1.894f, 19f, 3f, 19f)
        }
        }.build()

        return _sujood!!
    }

private var _sujood: ImageVector? = null
