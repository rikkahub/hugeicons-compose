package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ImageRemove02: ImageVector
    get() {
        if (_imageRemove02 != null) {
            return _imageRemove02!!
        }
        _imageRemove02 = ImageVector.Builder(
            name = "ImageRemove02",
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
        moveTo(3f, 16f)
        lineTo(7.46967f, 11.5303f)
        curveTo(7.80923f, 11.1908f, 8.26978f, 11f, 8.75f, 11f)
        curveTo(9.23022f, 11f, 9.69077f, 11.1908f, 10.0303f, 11.5303f)
        lineTo(14f, 15.5f)
        moveTo(15.5f, 17f)
        lineTo(14f, 15.5f)
        moveTo(21f, 16f)
        lineTo(18.5303f, 13.5303f)
        curveTo(18.1908f, 13.1908f, 17.7302f, 13f, 17.25f, 13f)
        curveTo(16.7698f, 13f, 16.3092f, 13.1908f, 15.9697f, 13.5303f)
        lineTo(14f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2.5f)
        curveTo(7.77027f, 2.5f, 5.6554f, 2.5f, 4.25276f, 3.69797f)
        curveTo(4.05358f, 3.86808f, 3.86808f, 4.05358f, 3.69797f, 4.25276f)
        curveTo(2.5f, 5.6554f, 2.5f, 7.77027f, 2.5f, 12f)
        curveTo(2.5f, 16.2297f, 2.5f, 18.3446f, 3.69797f, 19.7472f)
        curveTo(3.86808f, 19.9464f, 4.05358f, 20.1319f, 4.25276f, 20.302f)
        curveTo(5.6554f, 21.5f, 7.77027f, 21.5f, 12f, 21.5f)
        curveTo(16.2297f, 21.5f, 18.3446f, 21.5f, 19.7472f, 20.302f)
        curveTo(19.9464f, 20.1319f, 20.1319f, 19.9464f, 20.302f, 19.7472f)
        curveTo(21.5f, 18.3446f, 21.5f, 16.2297f, 21.5f, 12f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 6f)
        horizontalLineTo(14.5f)
        }
        }.build()

        return _imageRemove02!!
    }

private var _imageRemove02: ImageVector? = null
