package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Skype: ImageVector
    get() {
        if (_skype != null) {
            return _skype!!
        }
        _skype = ImageVector.Builder(
            name = "Skype",
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
        moveTo(15f, 10f)
        curveTo(15f, 8.89543f, 13.6569f, 8f, 12f, 8f)
        curveTo(10.3431f, 8f, 9f, 8.89543f, 9f, 10f)
        curveTo(9f, 11.1046f, 10.3431f, 12f, 12f, 12f)
        curveTo(13.6569f, 12f, 15f, 12.8954f, 15f, 14f)
        curveTo(15f, 15.1046f, 13.6569f, 16f, 12f, 16f)
        curveTo(10.3431f, 16f, 9f, 15.1046f, 9f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 20f)
        curveTo(20.2091f, 20f, 22f, 18.2091f, 22f, 16f)
        curveTo(22f, 14.9608f, 21.6037f, 14.0142f, 20.954f, 13.303f)
        curveTo(20.2792f, 12.5642f, 20.0562f, 12.2608f, 19.9675f, 11.2774f)
        curveTo(19.8052f, 9.47708f, 19.035f, 7.72126f, 17.6569f, 6.34315f)
        curveTo(15.4775f, 4.16375f, 12.3535f, 3.50467f, 9.60274f, 4.36591f)
        curveTo(8.65975f, 4.66116f, 8.29221f, 4.5711f, 7.3493f, 4.23329f)
        curveTo(6.92776f, 4.08227f, 6.47349f, 4f, 6f, 4f)
        curveTo(3.79086f, 4f, 2f, 5.79086f, 2f, 8f)
        curveTo(2f, 9.03918f, 2.39628f, 9.98581f, 3.04596f, 10.697f)
        curveTo(3.72081f, 11.4358f, 3.94384f, 11.7392f, 4.0325f, 12.7226f)
        curveTo(4.19482f, 14.5229f, 4.96503f, 16.2787f, 6.34315f, 17.6569f)
        curveTo(8.52254f, 19.8363f, 11.6465f, 20.4953f, 14.3973f, 19.6341f)
        curveTo(15.3403f, 19.3388f, 15.7078f, 19.4289f, 16.6507f, 19.7667f)
        curveTo(17.0722f, 19.9177f, 17.5265f, 20f, 18f, 20f)
        }
        }.build()

        return _skype!!
    }

private var _skype: ImageVector? = null
