package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoreOrLessCircle: ImageVector
    get() {
        if (_moreOrLessCircle != null) {
            return _moreOrLessCircle!!
        }
        _moreOrLessCircle = ImageVector.Builder(
            name = "MoreOrLessCircle",
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
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 12f)
        horizontalLineTo(16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5032f, 9.30152f)
        lineTo(9.46318f, 9.30167f)
        curveTo(8.4767f, 9.30167f, 7.64254f, 9.34937f, 7.51979f, 9.01499f)
        curveTo(7.42402f, 8.75401f, 7.91977f, 8.1f, 8.39977f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.50465f, 14.6985f)
        lineTo(14.5446f, 14.6983f)
        curveTo(15.5311f, 14.6983f, 16.3653f, 14.6506f, 16.488f, 14.985f)
        curveTo(16.5838f, 15.246f, 16.088f, 15.9f, 15.608f, 16.5f)
        }
        }.build()

        return _moreOrLessCircle!!
    }

private var _moreOrLessCircle: ImageVector? = null
