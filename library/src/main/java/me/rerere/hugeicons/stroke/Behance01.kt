package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Behance01: ImageVector
    get() {
        if (_behance01 != null) {
            return _behance01!!
        }
        _behance01 = ImageVector.Builder(
            name = "Behance01",
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
        moveTo(2f, 12f)
        horizontalLineTo(7.625f)
        moveTo(7.4f, 5f)
        horizontalLineTo(4f)
        curveTo(3.05719f, 5f, 2.58579f, 5f, 2.29289f, 5.29289f)
        curveTo(2f, 5.58579f, 2f, 6.05719f, 2f, 7f)
        verticalLineTo(17f)
        curveTo(2f, 17.9428f, 2f, 18.4142f, 2.29289f, 18.7071f)
        curveTo(2.58579f, 19f, 3.05719f, 19f, 4f, 19f)
        horizontalLineTo(7.4f)
        curveTo(9.38823f, 19f, 11f, 17.433f, 11f, 15.5f)
        curveTo(11f, 13.567f, 9.38823f, 12f, 7.4f, 12f)
        curveTo(9.38823f, 12f, 11f, 10.433f, 11f, 8.5f)
        curveTo(11f, 6.567f, 9.38823f, 5f, 7.4f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 7f)
        horizontalLineTo(16f)
        moveTo(14f, 14f)
        horizontalLineTo(22f)
        curveTo(22f, 11.9587f, 20.2091f, 10f, 18f, 10f)
        curveTo(15.7909f, 10f, 14f, 11.9587f, 14f, 14f)
        moveTo(14f, 14f)
        verticalLineTo(15f)
        curveTo(14f, 17.2091f, 15.7909f, 19f, 18f, 19f)
        curveTo(19.4806f, 19f, 20.7733f, 18.1956f, 21.4649f, 17f)
        }
        }.build()

        return _behance01!!
    }

private var _behance01: ImageVector? = null
