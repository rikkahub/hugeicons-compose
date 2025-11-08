package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tired01: ImageVector
    get() {
        if (_tired01 != null) {
            return _tired01!!
        }
        _tired01 = ImageVector.Builder(
            name = "Tired01",
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
        moveTo(7f, 8f)
        curveTo(7.20949f, 8.5826f, 7.77476f, 9f, 8.43922f, 9f)
        curveTo(9.10367f, 9f, 9.66894f, 8.5826f, 9.87843f, 8f)
        moveTo(14.1216f, 8f)
        curveTo(14.3311f, 8.5826f, 14.8963f, 9f, 15.5608f, 9f)
        curveTo(16.2252f, 9f, 16.7905f, 8.5826f, 17f, 8f)
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

        return _tired01!!
    }

private var _tired01: ImageVector? = null
