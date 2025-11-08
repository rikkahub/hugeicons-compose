package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TabletConnectedWifi: ImageVector
    get() {
        if (_tabletConnectedWifi != null) {
            return _tabletConnectedWifi!!
        }
        _tabletConnectedWifi = ImageVector.Builder(
            name = "TabletConnectedWifi",
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
        moveTo(22f, 18f)
        curveTo(21.8011f, 18.6891f, 21.4991f, 19.2323f, 21.0408f, 19.682f)
        curveTo(19.6974f, 21f, 17.5354f, 21f, 13.2113f, 21f)
        horizontalLineTo(11.1729f)
        curveTo(6.84873f, 21f, 4.68667f, 21f, 3.34333f, 19.682f)
        curveTo(2f, 18.364f, 2f, 16.2426f, 2f, 12f)
        curveTo(2f, 7.75736f, 2f, 5.63604f, 3.34333f, 4.31802f)
        curveTo(4.68667f, 3f, 6.84873f, 3f, 11.1729f, 3f)
        horizontalLineTo(13.2113f)
        curveTo(17.5354f, 3f, 19.6974f, 3f, 21.0408f, 4.31802f)
        curveTo(21.4991f, 4.76771f, 21.8011f, 5.31092f, 22f, 5.99999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9918f, 16f)
        horizontalLineTo(17f)
        moveTo(22f, 11.1144f)
        curveTo(20.7204f, 9.80801f, 18.9526f, 9f, 17f, 9f)
        curveTo(15.0474f, 9f, 13.2796f, 9.80801f, 12f, 11.1144f)
        moveTo(14.5f, 13.6667f)
        curveTo(15.1398f, 13.0135f, 16.0237f, 12.6095f, 17f, 12.6095f)
        curveTo(17.9763f, 12.6095f, 18.8602f, 13.0135f, 19.5f, 13.6667f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 3.5f)
        verticalLineTo(20.5f)
        }
        }.build()

        return _tabletConnectedWifi!!
    }

private var _tabletConnectedWifi: ImageVector? = null
