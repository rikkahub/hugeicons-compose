package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.News01: ImageVector
    get() {
        if (_news01 != null) {
            return _news01!!
        }
        _news01 = ImageVector.Builder(
            name = "News01",
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
        moveTo(10.5f, 8f)
        horizontalLineTo(18.5f)
        moveTo(10.5f, 12f)
        horizontalLineTo(13f)
        moveTo(18.5f, 12f)
        horizontalLineTo(16f)
        moveTo(10.5f, 16f)
        horizontalLineTo(13f)
        moveTo(18.5f, 16f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7.5f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 7.5f, 3.17157f, 7.5f, 2.58579f, 8.08579f)
        curveTo(2f, 8.67157f, 2f, 9.61438f, 2f, 11.5f)
        verticalLineTo(18f)
        curveTo(2f, 19.3807f, 3.11929f, 20.5f, 4.5f, 20.5f)
        curveTo(5.88071f, 20.5f, 7f, 19.3807f, 7f, 18f)
        verticalLineTo(7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 3.5f)
        horizontalLineTo(11f)
        curveTo(10.07f, 3.5f, 9.60504f, 3.5f, 9.22354f, 3.60222f)
        curveTo(8.18827f, 3.87962f, 7.37962f, 4.68827f, 7.10222f, 5.72354f)
        curveTo(7f, 6.10504f, 7f, 6.57003f, 7f, 7.5f)
        verticalLineTo(18f)
        curveTo(7f, 19.3807f, 5.88071f, 20.5f, 4.5f, 20.5f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 20.5f, 20.2426f, 20.5f, 21.1213f, 19.6213f)
        curveTo(22f, 18.7426f, 22f, 17.3284f, 22f, 14.5f)
        verticalLineTo(9.5f)
        curveTo(22f, 6.67157f, 22f, 5.25736f, 21.1213f, 4.37868f)
        curveTo(20.2426f, 3.5f, 18.8284f, 3.5f, 16f, 3.5f)
        }
        }.build()

        return _news01!!
    }

private var _news01: ImageVector? = null
