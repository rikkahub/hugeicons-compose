package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Submerge: ImageVector
    get() {
        if (_submerge != null) {
            return _submerge!!
        }
        _submerge = ImageVector.Builder(
            name = "Submerge",
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
        moveTo(7f, 2f)
        verticalLineTo(3f)
        moveTo(7f, 5.5f)
        verticalLineTo(6.5f)
        moveTo(7f, 9f)
        verticalLineTo(10f)
        moveTo(17f, 2f)
        verticalLineTo(3f)
        moveTo(17f, 5.5f)
        verticalLineTo(6.5f)
        moveTo(17f, 9f)
        verticalLineTo(10f)
        moveTo(12f, 2f)
        verticalLineTo(3f)
        moveTo(12f, 5.5f)
        verticalLineTo(6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        verticalLineTo(16f)
        curveTo(2f, 18.8284f, 2f, 20.2426f, 2.87868f, 21.1213f)
        curveTo(3.75736f, 22f, 5.17157f, 22f, 8f, 22f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 22f, 20.2426f, 22f, 21.1213f, 21.1213f)
        curveTo(22f, 20.2426f, 22f, 18.8284f, 22f, 16f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 14.8717f)
        curveTo(4.26409f, 16.7863f, 6.1743f, 15.7292f, 8.0217f, 14.833f)
        curveTo(9.59668f, 14.069f, 11.126f, 13.4219f, 12.79f, 14.833f)
        curveTo(16.0467f, 17.5465f, 18.9092f, 14.7526f, 22f, 14.1976f)
        }
        }.build()

        return _submerge!!
    }

private var _submerge: ImageVector? = null
