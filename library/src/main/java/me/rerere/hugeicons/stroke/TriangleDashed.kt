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

val HugeIcons.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) {
            return _triangleDashed!!
        }
        _triangleDashed = ImageVector.Builder(
            name = "TriangleDashed",
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
            moveTo(13.9248f, 3.97839f)
            curveTo(13.2978f, 3.32621f, 12.6956f, 3.00012f, 12f, 3.00012f)
            curveTo(11.3044f, 3.00012f, 10.7022f, 3.32621f, 10.0752f, 3.97839f)
            moveTo(16.3534f, 7.50012f)
            curveTo(16.5886f, 7.89227f, 16.8364f, 8.31004f, 17.0994f, 8.75344f)
            lineTo(17.5423f, 9.50012f)
            moveTo(7.64658f, 7.50012f)
            curveTo(7.41137f, 7.89227f, 7.16357f, 8.31004f, 6.90057f, 8.75345f)
            lineTo(6.45769f, 9.50012f)
            moveTo(19.3216f, 12.5001f)
            curveTo(19.7565f, 13.2344f, 20.1465f, 13.8976f, 20.4854f, 14.5001f)
            moveTo(4.6784f, 12.5001f)
            curveTo(4.24346f, 13.2344f, 3.8535f, 13.8976f, 3.51458f, 14.5001f)
            moveTo(21.9695f, 18.0001f)
            curveTo(22.0492f, 18.566f, 21.9745f, 19.0512f, 21.7236f, 19.4941f)
            curveTo(21.3899f, 20.0832f, 20.8323f, 20.4419f, 20f, 20.6603f)
            moveTo(2.0305f, 18.0001f)
            curveTo(1.95078f, 18.566f, 2.0255f, 19.0512f, 2.27636f, 19.4941f)
            curveTo(2.61013f, 20.0832f, 3.16765f, 20.4419f, 4f, 20.6603f)
            moveTo(16f, 20.9937f)
            curveTo(15.388f, 20.9999f, 14.7224f, 21.0001f, 14f, 21.0001f)
            moveTo(10f, 21.0001f)
            curveTo(9.27757f, 21.0001f, 8.612f, 20.9999f, 8f, 20.9937f)
        }
        }.build()

        return _triangleDashed!!
    }

private var _triangleDashed: ImageVector? = null
