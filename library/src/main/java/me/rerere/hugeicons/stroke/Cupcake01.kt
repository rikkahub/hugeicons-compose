package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cupcake01: ImageVector
    get() {
        if (_cupcake01 != null) {
            return _cupcake01!!
        }
        _cupcake01 = ImageVector.Builder(
            name = "Cupcake01",
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
        moveTo(6f, 13.5789f)
        lineTo(7.06237f, 18.0148f)
        curveTo(7.42652f, 19.5353f, 7.6086f, 20.2956f, 8.03895f, 20.8437f)
        curveTo(8.3231f, 21.2057f, 8.68075f, 21.4972f, 9.08605f, 21.6971f)
        curveTo(9.69988f, 22f, 10.4506f, 22f, 11.9521f, 22f)
        curveTo(13.5228f, 22f, 14.3081f, 22f, 14.9399f, 21.6754f)
        curveTo(15.3567f, 21.4613f, 15.7206f, 21.1498f, 16.0035f, 20.7652f)
        curveTo(16.4323f, 20.1822f, 16.5863f, 19.3783f, 16.8944f, 17.7706f)
        lineTo(18f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        curveTo(8.04103f, 10.4949f, 6f, 9.5f, 6.48618f, 7.54383f)
        moveTo(6.48618f, 7.54383f)
        curveTo(5.07413f, 7.78754f, 4f, 9.51833f, 4f, 11f)
        curveTo(4f, 12.6569f, 5f, 14f, 7f, 14f)
        curveTo(9f, 14f, 16f, 13f, 16f, 13f)
        curveTo(18.5f, 12.5f, 20f, 11f, 20f, 9.5f)
        curveTo(20f, 7.29086f, 18.2091f, 6f, 16f, 6f)
        curveTo(16f, 3.79086f, 14.2091f, 2f, 12f, 2f)
        curveTo(13f, 3f, 11.5f, 4.25f, 10f, 5f)
        curveTo(9f, 5.5f, 6.97235f, 5.58766f, 6.48618f, 7.54383f)
        }
        }.build()

        return _cupcake01!!
    }

private var _cupcake01: ImageVector? = null
