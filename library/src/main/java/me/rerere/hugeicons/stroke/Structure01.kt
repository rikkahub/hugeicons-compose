package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Structure01: ImageVector
    get() {
        if (_structure01 != null) {
            return _structure01!!
        }
        _structure01 = ImageVector.Builder(
            name = "Structure01",
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
        moveTo(12f, 9f)
        verticalLineTo(13f)
        moveTo(12f, 13f)
        horizontalLineTo(9f)
        curveTo(7.11438f, 13f, 6.17157f, 13f, 5.58579f, 13.5858f)
        curveTo(5f, 14.1716f, 5f, 15.1144f, 5f, 17f)
        moveTo(12f, 13f)
        horizontalLineTo(15f)
        curveTo(16.8856f, 13f, 17.8284f, 13f, 18.4142f, 13.5858f)
        curveTo(19f, 14.1716f, 19f, 15.1144f, 19f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.00866f, 21f)
        curveTo(2f, 20.7125f, 2f, 20.3821f, 2f, 20f)
        curveTo(2f, 18.5858f, 2f, 17.8787f, 2.43934f, 17.4393f)
        curveTo(2.87868f, 17f, 3.58579f, 17f, 5f, 17f)
        curveTo(6.41421f, 17f, 7.12132f, 17f, 7.56066f, 17.4393f)
        curveTo(8f, 17.8787f, 8f, 18.5858f, 8f, 20f)
        curveTo(8f, 20.3821f, 8f, 20.7125f, 7.99134f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0087f, 21f)
        curveTo(16f, 20.7125f, 16f, 20.3821f, 16f, 20f)
        curveTo(16f, 18.5858f, 16f, 17.8787f, 16.4393f, 17.4393f)
        curveTo(16.8787f, 17f, 17.5858f, 17f, 19f, 17f)
        curveTo(20.4142f, 17f, 21.1213f, 17f, 21.5607f, 17.4393f)
        curveTo(22f, 17.8787f, 22f, 18.5858f, 22f, 20f)
        curveTo(22f, 20.3821f, 22f, 20.7125f, 21.9913f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.2857f, 3f)
        horizontalLineTo(13.7143f)
        curveTo(15.7888f, 3f, 16f, 4.10993f, 16f, 6f)
        curveTo(16f, 7.89007f, 15.7888f, 9f, 13.7143f, 9f)
        horizontalLineTo(10.2857f)
        curveTo(8.2112f, 9f, 8f, 7.89007f, 8f, 6f)
        curveTo(8f, 4.10993f, 8.2112f, 3f, 10.2857f, 3f)
        }
        }.build()

        return _structure01!!
    }

private var _structure01: ImageVector? = null
