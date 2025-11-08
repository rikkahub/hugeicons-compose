package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Candelier02: ImageVector
    get() {
        if (_candelier02 != null) {
            return _candelier02!!
        }
        _candelier02 = ImageVector.Builder(
            name = "Candelier02",
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
        moveTo(2f, 3f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 3f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 3f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 11.0001f)
        curveTo(2.7846f, 11.0001f, 1.7947f, 13.512f, 2.03594f, 14.9903f)
        curveTo(2.24261f, 16.2568f, 6.73167f, 16.4143f, 6.96406f, 14.9903f)
        curveTo(7.2053f, 13.512f, 6.21541f, 11.0001f, 4.5f, 11.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        curveTo(10.2846f, 16f, 9.2947f, 18.5119f, 9.53594f, 19.9902f)
        curveTo(9.74261f, 21.2567f, 14.2317f, 21.4142f, 14.4641f, 19.9902f)
        curveTo(14.7053f, 18.5119f, 13.7154f, 16f, 12f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 11.0001f)
        curveTo(17.7846f, 11.0001f, 16.7947f, 13.512f, 17.0359f, 14.9903f)
        curveTo(17.2426f, 16.2568f, 21.7317f, 16.4143f, 21.9641f, 14.9903f)
        curveTo(22.2053f, 13.512f, 21.2154f, 11.0001f, 19.5f, 11.0001f)
        }
        }.build()

        return _candelier02!!
    }

private var _candelier02: ImageVector? = null
