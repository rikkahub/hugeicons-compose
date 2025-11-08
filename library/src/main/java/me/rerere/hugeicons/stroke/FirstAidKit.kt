package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FirstAidKit: ImageVector
    get() {
        if (_firstAidKit != null) {
            return _firstAidKit!!
        }
        _firstAidKit = ImageVector.Builder(
            name = "FirstAidKit",
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
        moveTo(2f, 12.5625f)
        curveTo(2f, 9.46891f, 2f, 7.92211f, 3.02513f, 6.96106f)
        curveTo(4.05025f, 6f, 5.70017f, 6f, 9f, 6f)
        horizontalLineTo(15f)
        curveTo(18.2998f, 6f, 19.9497f, 6f, 20.9749f, 6.96106f)
        curveTo(22f, 7.92211f, 22f, 9.46891f, 22f, 12.5625f)
        verticalLineTo(14.4375f)
        curveTo(22f, 17.5311f, 22f, 19.0779f, 20.9749f, 20.0389f)
        curveTo(19.9497f, 21f, 18.2998f, 21f, 15f, 21f)
        horizontalLineTo(9f)
        curveTo(5.70017f, 21f, 4.05025f, 21f, 3.02513f, 20.0389f)
        curveTo(2f, 19.0779f, 2f, 17.5311f, 2f, 14.4375f)
        verticalLineTo(12.5625f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 13.5f)
        horizontalLineTo(15f)
        moveTo(12f, 10.5f)
        lineTo(12f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 6f)
        curveTo(17f, 3.518f, 16.482f, 3f, 14f, 3f)
        horizontalLineTo(10f)
        curveTo(7.518f, 3f, 7f, 3.518f, 7f, 6f)
        }
        }.build()

        return _firstAidKit!!
    }

private var _firstAidKit: ImageVector? = null
