package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mosque01: ImageVector
    get() {
        if (_mosque01 != null) {
            return _mosque01!!
        }
        _mosque01 = ImageVector.Builder(
            name = "Mosque01",
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
        moveTo(8.65309f, 9f)
        curveTo(5.18214f, 5.5f, 10.5125f, 3.75f, 12f, 2f)
        curveTo(13.4875f, 3.75f, 18.8179f, 5.5f, 15.3469f, 9f)
        horizontalLineTo(8.65309f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 12f)
        verticalLineTo(11f)
        curveTo(18f, 10.0572f, 18f, 9.58579f, 17.7071f, 9.29289f)
        curveTo(17.4142f, 9f, 16.9428f, 9f, 16f, 9f)
        horizontalLineTo(8f)
        curveTo(7.05719f, 9f, 6.58579f, 9f, 6.29289f, 9.29289f)
        curveTo(6f, 9.58579f, 6f, 10.0572f, 6f, 11f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 12f)
        horizontalLineTo(7f)
        curveTo(5.58579f, 12f, 4.87868f, 12f, 4.43934f, 12.4393f)
        curveTo(4f, 12.8787f, 4f, 13.5858f, 4f, 15f)
        verticalLineTo(19f)
        curveTo(4f, 20.4142f, 4f, 21.1213f, 4.43934f, 21.5607f)
        curveTo(4.87868f, 22f, 5.58579f, 22f, 7f, 22f)
        horizontalLineTo(17f)
        curveTo(18.4142f, 22f, 19.1213f, 22f, 19.5607f, 21.5607f)
        curveTo(20f, 21.1213f, 20f, 20.4142f, 20f, 19f)
        verticalLineTo(15f)
        curveTo(20f, 13.5858f, 20f, 12.8787f, 19.5607f, 12.4393f)
        curveTo(19.1213f, 12f, 18.4142f, 12f, 17f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.50009f, 22f)
        verticalLineTo(19f)
        curveTo(9.48279f, 16f, 12f, 15f, 12f, 15f)
        curveTo(12f, 15f, 14.5172f, 16f, 14.4999f, 19f)
        verticalLineTo(22f)
        }
        }.build()

        return _mosque01!!
    }

private var _mosque01: ImageVector? = null
