package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Playlist02: ImageVector
    get() {
        if (_playlist02 != null) {
            return _playlist02!!
        }
        _playlist02 = ImageVector.Builder(
            name = "Playlist02",
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
        moveTo(2f, 9f)
        curveTo(2f, 5.70017f, 2f, 4.05025f, 3.02513f, 3.02513f)
        curveTo(4.05025f, 2f, 5.70017f, 2f, 9f, 2f)
        horizontalLineTo(11f)
        curveTo(14.2998f, 2f, 15.9497f, 2f, 16.9749f, 3.02513f)
        curveTo(18f, 4.05025f, 18f, 5.70017f, 18f, 9f)
        verticalLineTo(11f)
        curveTo(18f, 14.2998f, 18f, 15.9497f, 16.9749f, 16.9749f)
        curveTo(15.9497f, 18f, 14.2998f, 18f, 11f, 18f)
        horizontalLineTo(9f)
        curveTo(5.70017f, 18f, 4.05025f, 18f, 3.02513f, 16.9749f)
        curveTo(2f, 15.9497f, 2f, 14.2998f, 2f, 11f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.2383f, 7f)
        curveTo(19.5732f, 7.08138f, 20.4232f, 7.30467f, 21.036f, 7.91738f)
        curveTo(22f, 8.88143f, 22f, 10.433f, 22f, 13.5363f)
        verticalLineTo(15.4171f)
        curveTo(22f, 18.5203f, 22f, 20.0719f, 21.036f, 21.036f)
        curveTo(20.0719f, 22f, 18.5203f, 22f, 15.4171f, 22f)
        horizontalLineTo(13.5363f)
        curveTo(10.433f, 22f, 8.88143f, 22f, 7.91738f, 21.036f)
        curveTo(7.30467f, 20.4232f, 7.08138f, 19.5732f, 7f, 18.2383f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 12f)
        verticalLineTo(6f)
        curveTo(11.2222f, 6.4f, 11.4f, 8.08f, 13f, 8.4f)
        moveTo(11f, 12f)
        curveTo(11f, 13.1046f, 10.1046f, 14f, 9f, 14f)
        curveTo(7.89543f, 14f, 7f, 13.1046f, 7f, 12f)
        curveTo(7f, 10.8954f, 7.89543f, 10f, 9f, 10f)
        curveTo(10.1046f, 10f, 11f, 10.8954f, 11f, 12f)
        }
        }.build()

        return _playlist02!!
    }

private var _playlist02: ImageVector? = null
