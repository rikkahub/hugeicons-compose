package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Napkins01: ImageVector
    get() {
        if (_napkins01 != null) {
            return _napkins01!!
        }
        _napkins01 = ImageVector.Builder(
            name = "Napkins01",
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
        moveTo(12f, 19f)
        horizontalLineTo(19.9086f)
        curveTo(20.5114f, 19f, 21f, 18.5114f, 21f, 17.9086f)
        curveTo(21f, 17.6451f, 20.9047f, 17.3905f, 20.7316f, 17.1919f)
        lineTo(7.80815f, 2.3538f)
        curveTo(7.61238f, 2.12903f, 7.3289f, 2f, 7.03082f, 2f)
        curveTo(6.46152f, 2f, 6f, 2.46152f, 6f, 3.03082f)
        verticalLineTo(13f)
        curveTo(6f, 15.8284f, 6f, 17.2426f, 6.87868f, 18.1213f)
        curveTo(7.75736f, 19f, 9.17157f, 19f, 12f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 6.72222f)
        lineTo(4.80815f, 5.3538f)
        curveTo(4.61238f, 5.12903f, 4.3289f, 5f, 4.03082f, 5f)
        curveTo(3.46152f, 5f, 3f, 5.46152f, 3f, 6.03082f)
        verticalLineTo(16f)
        curveTo(3f, 18.8284f, 3f, 20.2426f, 3.87868f, 21.1213f)
        curveTo(4.75736f, 22f, 6.17157f, 22f, 9f, 22f)
        horizontalLineTo(16.9086f)
        curveTo(17.5114f, 22f, 18f, 21.5114f, 18f, 20.9086f)
        curveTo(18f, 20.6451f, 17.9047f, 20.3905f, 17.7316f, 20.1919f)
        lineTo(16.6935f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 4f)
        verticalLineTo(16f)
        horizontalLineTo(19.5f)
        }
        }.build()

        return _napkins01!!
    }

private var _napkins01: ImageVector? = null
