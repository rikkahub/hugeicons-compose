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

val HugeIcons.MapPinned: ImageVector
    get() {
        if (_mapPinned != null) {
            return _mapPinned!!
        }
        _mapPinned = ImageVector.Builder(
            name = "MapPinned",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.4978f, 9.5f)
            curveTo(14.4978f, 10.8807f, 13.3785f, 12f, 11.9978f, 12f)
            curveTo(10.6171f, 12f, 9.4978f, 10.8807f, 9.4978f, 9.5f)
            curveTo(9.4978f, 8.11929f, 10.6171f, 7f, 11.9978f, 7f)
            curveTo(13.3785f, 7f, 14.4978f, 8.11929f, 14.4978f, 9.5f)
            close()
        }

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
            moveTo(3.997f, 16.5f)
            curveTo(3.18485f, 18.5304f, 2.77878f, 19.5455f, 3.12686f, 20.3199f)
            curveTo(3.22151f, 20.5305f, 3.35191f, 20.7231f, 3.51228f, 20.8892f)
            curveTo(4.10202f, 21.5f, 5.1954f, 21.5f, 7.38216f, 21.5f)
            horizontalLineTo(16.6118f)
            curveTo(18.7986f, 21.5f, 19.892f, 21.5f, 20.4817f, 20.8892f)
            curveTo(20.6421f, 20.7231f, 20.7725f, 20.5305f, 20.8671f, 20.3199f)
            curveTo(21.2152f, 19.5455f, 20.8091f, 18.5303f, 19.997f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.2552f, 17.9936f)
            curveTo(12.9179f, 18.3184f, 12.4671f, 18.5f, 11.998f, 18.5f)
            curveTo(11.5288f, 18.5f, 11.078f, 18.3184f, 10.7407f, 17.9936f)
            curveTo(7.6521f, 15.0008f, 3.51299f, 11.6575f, 5.53151f, 6.80373f)
            curveTo(6.62291f, 4.17932f, 9.24275f, 2.5f, 11.998f, 2.5f)
            curveTo(14.7532f, 2.5f, 17.373f, 4.17933f, 18.4644f, 6.80373f)
            curveTo(20.4804f, 11.6514f, 16.3514f, 15.0111f, 13.2552f, 17.9936f)
            close()
        }
        }.build()

        return _mapPinned!!
    }

private var _mapPinned: ImageVector? = null
