package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Unarchive03: ImageVector
    get() {
        if (_unarchive03 != null) {
            return _unarchive03!!
        }
        _unarchive03 = ImageVector.Builder(
            name = "Unarchive03",
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
        moveTo(21f, 7f)
        horizontalLineTo(3f)
        verticalLineTo(13f)
        curveTo(3f, 16.7712f, 3f, 18.6569f, 4.17157f, 19.8284f)
        curveTo(5.34315f, 21f, 7.22876f, 21f, 11f, 21f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 21f, 18.6569f, 21f, 19.8284f, 19.8284f)
        curveTo(21f, 18.6569f, 21f, 16.7712f, 21f, 13f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 7f)
        horizontalLineTo(3f)
        lineTo(4.2f, 5.4f)
        curveTo(5.08328f, 4.22229f, 5.52492f, 3.63344f, 6.15836f, 3.31672f)
        curveTo(6.7918f, 3f, 7.52786f, 3f, 9f, 3f)
        horizontalLineTo(15f)
        curveTo(16.4721f, 3f, 17.2082f, 3f, 17.8416f, 3.31672f)
        curveTo(18.4751f, 3.63344f, 18.9167f, 4.22229f, 19.8f, 5.4f)
        lineTo(21f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11f)
        lineTo(12f, 17.5f)
        moveTo(9f, 13.5f)
        curveTo(9.58984f, 12.8932f, 11.1597f, 10.5f, 12f, 10.5f)
        curveTo(12.8403f, 10.5f, 14.4102f, 12.8932f, 15f, 13.5f)
        }
        }.build()

        return _unarchive03!!
    }

private var _unarchive03: ImageVector? = null
