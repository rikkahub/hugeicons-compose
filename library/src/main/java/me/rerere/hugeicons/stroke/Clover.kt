package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Clover: ImageVector
    get() {
        if (_clover != null) {
            return _clover!!
        }
        _clover = ImageVector.Builder(
            name = "Clover",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.5f, 8f)
            lineTo(7.89963f, 6.39963f)
            curveTo(6.89316f, 5.39316f, 6.89315f, 3.76133f, 7.89963f, 2.75486f)
            curveTo(8.90611f, 1.74838f, 10.5379f, 1.74838f, 11.5444f, 2.75486f)
            lineTo(12f, 3.21045f)
            lineTo(12.4556f, 2.75486f)
            curveTo(13.4621f, 1.74838f, 15.0939f, 1.74838f, 16.1004f, 2.75486f)
            curveTo(17.1068f, 3.76133f, 17.1068f, 5.39315f, 16.1004f, 6.39963f)
            lineTo(14.5f, 8f)
            moveTo(16.1004f, 6.39963f)
            curveTo(17.1068f, 5.39315f, 18.7387f, 5.39315f, 19.7451f, 6.39963f)
            curveTo(20.7516f, 7.40611f, 20.7516f, 9.03793f, 19.7451f, 10.0444f)
            lineTo(19.2895f, 10.5f)
            lineTo(19.7451f, 10.9556f)
            curveTo(20.7516f, 11.9621f, 20.7516f, 13.5939f, 19.7451f, 14.6004f)
            curveTo(18.7387f, 15.6068f, 17.1068f, 15.6068f, 16.1004f, 14.6004f)
            moveTo(16.1004f, 14.6004f)
            curveTo(17.1068f, 15.6068f, 17.1068f, 17.2387f, 16.1004f, 18.2451f)
            curveTo(15.0939f, 19.2516f, 13.4621f, 19.2516f, 12.4556f, 18.2451f)
            lineTo(12f, 17.7895f)
            lineTo(11.5444f, 18.2451f)
            curveTo(10.5379f, 19.2516f, 8.90611f, 19.2516f, 7.89963f, 18.2451f)
            curveTo(6.89315f, 17.2387f, 6.89316f, 15.6068f, 7.89963f, 14.6004f)
            moveTo(16.1004f, 14.6004f)
            lineTo(14.5f, 13f)
            moveTo(7.89963f, 14.6004f)
            curveTo(6.89316f, 15.6068f, 5.26133f, 15.6068f, 4.25486f, 14.6004f)
            curveTo(3.24838f, 13.5939f, 3.24838f, 11.9621f, 4.25486f, 10.9556f)
            lineTo(4.71045f, 10.5f)
            lineTo(4.25486f, 10.0444f)
            curveTo(3.24838f, 9.03793f, 3.24838f, 7.40611f, 4.25486f, 6.39963f)
            curveTo(5.26133f, 5.39315f, 6.89316f, 5.39316f, 7.89963f, 6.39963f)
            moveTo(7.89963f, 14.6004f)
            lineTo(9.5f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.5f, 15f)
            lineTo(5.62132f, 16.8787f)
            curveTo(4.26306f, 18.2369f, 3.5f, 20.0791f, 3.5f, 22f)
        }
        }.build()

        return _clover!!
    }

private var _clover: ImageVector? = null
