package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ContactBook: ImageVector
    get() {
        if (_contactBook != null) {
            return _contactBook!!
        }
        _contactBook = ImageVector.Builder(
            name = "ContactBook",
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
        moveTo(4.5f, 10f)
        curveTo(4.5f, 6.22876f, 4.5f, 4.34315f, 5.67157f, 3.17157f)
        curveTo(6.84315f, 2f, 8.72876f, 2f, 12.5f, 2f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 2f, 19.6569f, 2f, 20.8284f, 3.17157f)
        curveTo(22f, 4.34315f, 22f, 6.22876f, 22f, 10f)
        verticalLineTo(14f)
        curveTo(22f, 17.7712f, 22f, 19.6569f, 20.8284f, 20.8284f)
        curveTo(19.6569f, 22f, 17.7712f, 22f, 14f, 22f)
        horizontalLineTo(12.5f)
        curveTo(8.72876f, 22f, 6.84315f, 22f, 5.67157f, 20.8284f)
        curveTo(4.5f, 19.6569f, 4.5f, 17.7712f, 4.5f, 14f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 6f)
        horizontalLineTo(2f)
        moveTo(4.5f, 12f)
        horizontalLineTo(2f)
        moveTo(4.5f, 18f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.2748f, 8.49261f)
        curveTo(15.2748f, 9.59715f, 14.3794f, 10.4926f, 13.2749f, 10.4926f)
        curveTo(12.1704f, 10.4926f, 11.275f, 9.59715f, 11.275f, 8.49261f)
        curveTo(11.275f, 7.38808f, 12.1704f, 6.49268f, 13.2749f, 6.49268f)
        curveTo(14.3794f, 6.49268f, 15.2748f, 7.38808f, 15.2748f, 8.49261f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.31982f, 15.7161f)
        curveTo(10.3782f, 14.0868f, 12.0589f, 13.4762f, 13.2749f, 13.4774f)
        curveTo(14.491f, 13.4787f, 16.1224f, 14.0868f, 17.1807f, 15.7161f)
        curveTo(17.2492f, 15.8215f, 17.268f, 15.9512f, 17.2063f, 16.0607f)
        curveTo(16.9588f, 16.4996f, 16.1903f, 17.3705f, 15.6352f, 17.4296f)
        curveTo(14.9975f, 17.4974f, 13.3291f, 17.5069f, 13.2762f, 17.5072f)
        curveTo(13.2232f, 17.5069f, 11.5034f, 17.4974f, 10.8653f, 17.4296f)
        curveTo(10.3103f, 17.3705f, 9.5418f, 16.4996f, 9.29429f, 16.0607f)
        curveTo(9.23254f, 15.9512f, 9.25139f, 15.8215f, 9.31982f, 15.7161f)
        }
        }.build()

        return _contactBook!!
    }

private var _contactBook: ImageVector? = null
