package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DiscoverSquare: ImageVector
    get() {
        if (_discoverSquare != null) {
            return _discoverSquare!!
        }
        _discoverSquare = ImageVector.Builder(
            name = "DiscoverSquare",
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
        moveTo(12.4014f, 8.29796f)
        lineTo(15.3213f, 7.32465f)
        curveTo(16.2075f, 7.02924f, 16.6507f, 6.88153f, 16.8846f, 7.11544f)
        curveTo(17.1185f, 7.34935f, 16.9708f, 7.79247f, 16.6753f, 8.67871f)
        lineTo(15.702f, 11.5986f)
        curveTo(15.1986f, 13.1088f, 14.9469f, 13.8639f, 14.4054f, 14.4054f)
        curveTo(13.8639f, 14.9469f, 13.1088f, 15.1986f, 11.5986f, 15.702f)
        lineTo(8.67871f, 16.6753f)
        curveTo(7.79247f, 16.9708f, 7.34935f, 17.1185f, 7.11544f, 16.8846f)
        curveTo(6.88153f, 16.6507f, 7.02924f, 16.2075f, 7.32465f, 15.3213f)
        lineTo(8.29796f, 12.4014f)
        curveTo(8.80136f, 10.8912f, 9.05306f, 10.1361f, 9.59457f, 9.59457f)
        curveTo(10.1361f, 9.05306f, 10.8912f, 8.80136f, 12.4014f, 8.29796f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        lineTo(11.9936f, 12.0064f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }
        }.build()

        return _discoverSquare!!
    }

private var _discoverSquare: ImageVector? = null
