package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Home12: ImageVector
    get() {
        if (_home12 != null) {
            return _home12!!
        }
        _home12 = ImageVector.Builder(
            name = "Home12",
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
        moveTo(2f, 10f)
        lineTo(11.1076f, 2.80982f)
        curveTo(11.3617f, 2.60915f, 11.6761f, 2.5f, 12f, 2.5f)
        curveTo(12.3239f, 2.5f, 12.6383f, 2.60915f, 12.8924f, 2.80982f)
        lineTo(16.5f, 5.65789f)
        verticalLineTo(4f)
        curveTo(16.5f, 3.44772f, 16.9477f, 3f, 17.5f, 3f)
        horizontalLineTo(18.5f)
        curveTo(19.0523f, 3f, 19.5f, 3.44771f, 19.5f, 4f)
        verticalLineTo(8.02632f)
        lineTo(22f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 11.5f)
        verticalLineTo(15.5f)
        curveTo(20f, 18.3284f, 20f, 19.7426f, 19.1213f, 20.6213f)
        curveTo(18.2426f, 21.5f, 16.8284f, 21.5f, 14f, 21.5f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 21.5f, 5.75736f, 21.5f, 4.87868f, 20.6213f)
        curveTo(4f, 19.7426f, 4f, 18.3284f, 4f, 15.5f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0011f, 15.5f)
        curveTo(14.2016f, 16.1224f, 13.1513f, 16.5f, 12.0011f, 16.5f)
        curveTo(10.8509f, 16.5f, 9.80062f, 16.1224f, 9.0011f, 15.5f)
        }
        }.build()

        return _home12!!
    }

private var _home12: ImageVector? = null
