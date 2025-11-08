package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ClosedCaption: ImageVector
    get() {
        if (_closedCaption != null) {
            return _closedCaption!!
        }
        _closedCaption = ImageVector.Builder(
            name = "ClosedCaption",
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
        moveTo(2f, 12f)
        curveTo(2f, 8.02033f, 2f, 6.03049f, 3.0528f, 4.70201f)
        curveTo(3.22119f, 4.48953f, 3.40678f, 4.29302f, 3.60746f, 4.11473f)
        curveTo(4.86213f, 3f, 6.74142f, 3f, 10.5f, 3f)
        horizontalLineTo(13.5f)
        curveTo(17.2586f, 3f, 19.1379f, 3f, 20.3925f, 4.11473f)
        curveTo(20.5932f, 4.29302f, 20.7788f, 4.48953f, 20.9472f, 4.70201f)
        curveTo(22f, 6.03049f, 22f, 8.02033f, 22f, 12f)
        curveTo(22f, 15.9797f, 22f, 17.9695f, 20.9472f, 19.298f)
        curveTo(20.7788f, 19.5105f, 20.5932f, 19.707f, 20.3925f, 19.8853f)
        curveTo(19.1379f, 21f, 17.2586f, 21f, 13.5f, 21f)
        horizontalLineTo(10.5f)
        curveTo(6.74142f, 21f, 4.86213f, 21f, 3.60746f, 19.8853f)
        curveTo(3.40678f, 19.707f, 3.22119f, 19.5105f, 3.0528f, 19.298f)
        curveTo(2f, 17.9695f, 2f, 15.9797f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 9f)
        horizontalLineTo(10f)
        curveTo(9.06812f, 9f, 8.60218f, 9f, 8.23463f, 9.15224f)
        curveTo(7.74458f, 9.35523f, 7.35523f, 9.74458f, 7.15224f, 10.2346f)
        curveTo(7f, 10.6022f, 7f, 11.0681f, 7f, 12f)
        curveTo(7f, 12.9319f, 7f, 13.3978f, 7.15224f, 13.7654f)
        curveTo(7.35523f, 14.2554f, 7.74458f, 14.6448f, 8.23463f, 14.8478f)
        curveTo(8.60218f, 15f, 9.06812f, 15f, 10f, 15f)
        horizontalLineTo(10.5f)
        moveTo(17f, 9f)
        horizontalLineTo(16.5f)
        curveTo(15.5681f, 9f, 15.1022f, 9f, 14.7346f, 9.15224f)
        curveTo(14.2446f, 9.35523f, 13.8552f, 9.74458f, 13.6522f, 10.2346f)
        curveTo(13.5f, 10.6022f, 13.5f, 11.0681f, 13.5f, 12f)
        curveTo(13.5f, 12.9319f, 13.5f, 13.3978f, 13.6522f, 13.7654f)
        curveTo(13.8552f, 14.2554f, 14.2446f, 14.6448f, 14.7346f, 14.8478f)
        curveTo(15.1022f, 15f, 15.5681f, 15f, 16.5f, 15f)
        horizontalLineTo(17f)
        }
        }.build()

        return _closedCaption!!
    }

private var _closedCaption: ImageVector? = null
