package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tired02: ImageVector
    get() {
        if (_tired02 != null) {
            return _tired02!!
        }
        _tired02 = ImageVector.Builder(
            name = "Tired02",
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
        moveTo(8f, 8f)
        curveTo(8.42317f, 8.31737f, 9.19208f, 8.70974f, 9.28942f, 9.34118f)
        curveTo(9.29507f, 9.37783f, 9.2989f, 9.41481f, 9.30089f, 9.45195f)
        curveTo(9.32383f, 9.88051f, 9.01424f, 10.2537f, 8.39506f, 11f)
        moveTo(16f, 8f)
        curveTo(15.5768f, 8.31738f, 14.8079f, 8.70974f, 14.7106f, 9.34118f)
        curveTo(14.7049f, 9.37783f, 14.7011f, 9.41481f, 14.6991f, 9.45195f)
        curveTo(14.6762f, 9.88051f, 14.9858f, 10.2537f, 15.6049f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13.5f)
        curveTo(13.6732f, 13.5f, 15.1098f, 14.4559f, 15.7297f, 15.8205f)
        curveTo(15.9802f, 16.3718f, 16.1055f, 16.6475f, 15.8889f, 16.8748f)
        curveTo(15.6723f, 17.1022f, 15.2907f, 16.9913f, 14.5274f, 16.7696f)
        curveTo(13.8039f, 16.5595f, 12.9019f, 16.3703f, 12f, 16.3703f)
        curveTo(11.0981f, 16.3703f, 10.1961f, 16.5595f, 9.47257f, 16.7696f)
        curveTo(8.70933f, 16.9913f, 8.32771f, 17.1022f, 8.11112f, 16.8748f)
        curveTo(7.89454f, 16.6475f, 8.01978f, 16.3718f, 8.27026f, 15.8205f)
        curveTo(8.89021f, 14.4559f, 10.3268f, 13.5f, 12f, 13.5f)
        }
        }.build()

        return _tired02!!
    }

private var _tired02: ImageVector? = null
