package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TriangleDash: ImageVector
    get() {
        if (_triangleDash != null) {
            return _triangleDash!!
        }
        _triangleDash = ImageVector.Builder(
            name = "TriangleDash",
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
        moveTo(13.9248f, 3.97827f)
        curveTo(13.2978f, 3.32609f, 12.6956f, 3f, 12f, 3f)
        curveTo(11.3044f, 3f, 10.7022f, 3.32609f, 10.0752f, 3.97827f)
        moveTo(16.3534f, 7.5f)
        curveTo(16.5886f, 7.89214f, 16.8364f, 8.30992f, 17.0994f, 8.75332f)
        lineTo(17.5423f, 9.5f)
        moveTo(7.64658f, 7.5f)
        curveTo(7.41137f, 7.89215f, 7.16357f, 8.30992f, 6.90057f, 8.75333f)
        lineTo(6.45769f, 9.5f)
        moveTo(19.3216f, 12.5f)
        curveTo(19.7565f, 13.2343f, 20.1465f, 13.8974f, 20.4854f, 14.5f)
        moveTo(4.6784f, 12.5f)
        curveTo(4.24346f, 13.2343f, 3.8535f, 13.8974f, 3.51458f, 14.5f)
        moveTo(21.9695f, 18f)
        curveTo(22.0492f, 18.5659f, 21.9745f, 19.0511f, 21.7236f, 19.4939f)
        curveTo(21.3899f, 20.0831f, 20.8323f, 20.4418f, 20f, 20.6602f)
        moveTo(2.0305f, 18f)
        curveTo(1.95078f, 18.5659f, 2.0255f, 19.0511f, 2.27636f, 19.4939f)
        curveTo(2.61013f, 20.0831f, 3.16765f, 20.4418f, 4f, 20.6602f)
        moveTo(16f, 20.9936f)
        curveTo(15.388f, 20.9998f, 14.7224f, 21f, 14f, 21f)
        moveTo(10f, 21f)
        curveTo(9.27757f, 21f, 8.612f, 20.9998f, 8f, 20.9936f)
        }
        }.build()

        return _triangleDash!!
    }

private var _triangleDash: ImageVector? = null
