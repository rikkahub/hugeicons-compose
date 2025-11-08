package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Unlink01: ImageVector
    get() {
        if (_unlink01 != null) {
            return _unlink01!!
        }
        _unlink01 = ImageVector.Builder(
            name = "Unlink01",
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
        moveTo(12.1434f, 10.691f)
        lineTo(12.3503f, 10.4841f)
        curveTo(14.329f, 8.50532f, 17.5372f, 8.50532f, 19.5159f, 10.4841f)
        curveTo(21.4947f, 12.4628f, 21.4947f, 15.671f, 19.5159f, 17.6497f)
        lineTo(16.6497f, 20.5159f)
        curveTo(14.671f, 22.4947f, 11.4628f, 22.4947f, 9.48405f, 20.5159f)
        curveTo(7.50532f, 18.5372f, 7.50532f, 15.329f, 9.48405f, 13.3503f)
        lineTo(9.9484f, 12.886f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.0516f, 11.114f)
        lineTo(20.5159f, 10.6497f)
        curveTo(22.4947f, 8.67095f, 22.4947f, 5.46279f, 20.5159f, 3.48405f)
        curveTo(18.5372f, 1.50532f, 15.329f, 1.50532f, 13.3503f, 3.48405f)
        lineTo(10.4841f, 6.35031f)
        curveTo(8.50532f, 8.32904f, 8.50532f, 11.5372f, 10.4841f, 13.5159f)
        curveTo(12.4628f, 15.4947f, 15.671f, 15.4947f, 17.6497f, 13.5159f)
        lineTo(17.8566f, 13.309f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 4f)
        lineTo(6f, 6f)
        moveTo(2f, 8f)
        lineTo(5f, 9f)
        moveTo(3f, 13.5f)
        lineTo(5f, 12f)
        }
        }.build()

        return _unlink01!!
    }

private var _unlink01: ImageVector? = null
