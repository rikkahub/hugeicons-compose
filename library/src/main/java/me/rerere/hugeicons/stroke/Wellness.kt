package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wellness: ImageVector
    get() {
        if (_wellness != null) {
            return _wellness!!
        }
        _wellness = ImageVector.Builder(
            name = "Wellness",
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
        moveTo(4f, 14.0695f)
        curveTo(5.0145f, 14.0695f, 6.43122f, 13.7685f, 7.31944f, 14.4193f)
        lineTo(9.08188f, 15.7108f)
        curveTo(9.73667f, 16.1906f, 10.4458f, 16.0325f, 11.1765f, 15.9178f)
        curveTo(12.1389f, 15.7667f, 13f, 16.5875f, 13f, 17.6562f)
        curveTo(13f, 17.9482f, 10.9272f, 18.6905f, 10.6276f, 18.8316f)
        curveTo(10.0391f, 19.1088f, 9.36297f, 19.0406f, 8.83021f, 18.6502f)
        lineTo(6.84211f, 17.1934f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 17f)
        lineTo(17.091f, 15.1096f)
        curveTo(17.8244f, 14.854f, 18.6331f, 15.0535f, 19.1797f, 15.625f)
        lineTo(19.8505f, 16.3262f)
        curveTo(20.0902f, 16.5768f, 20.0338f, 16.9976f, 19.7375f, 17.1697f)
        lineTo(11.8829f, 21.7315f)
        curveTo(11.4097f, 22.0063f, 10.8514f, 22.0734f, 10.3309f, 21.9179f)
        lineTo(4f, 20.0269f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0019f, 12f)
        curveTo(12.0019f, 12f, 14.1019f, 9.76142f, 14.1019f, 7f)
        curveTo(14.1019f, 4.23858f, 12.0019f, 2f, 12.0019f, 2f)
        curveTo(12.0019f, 2f, 9.9019f, 4.23858f, 9.9019f, 7f)
        curveTo(9.9019f, 9.76142f, 12.0019f, 12f, 12.0019f, 12f)
        moveTo(12.0019f, 12f)
        curveTo(12.0019f, 12f, 15.0689f, 11.9316f, 17.0019f, 9.95918f)
        curveTo(18.9349f, 7.98674f, 19.0019f, 4.85714f, 19.0019f, 4.85714f)
        curveTo(19.0019f, 4.85714f, 17.7324f, 4.88544f, 16.3122f, 5.43087f)
        moveTo(12.0019f, 12f)
        curveTo(12.0019f, 12f, 8.9349f, 11.9316f, 7.0019f, 9.95918f)
        curveTo(5.0689f, 7.98674f, 5.0019f, 4.85714f, 5.0019f, 4.85714f)
        curveTo(5.0019f, 4.85714f, 6.27135f, 4.88544f, 7.69157f, 5.43087f)
        }
        }.build()

        return _wellness!!
    }

private var _wellness: ImageVector? = null
