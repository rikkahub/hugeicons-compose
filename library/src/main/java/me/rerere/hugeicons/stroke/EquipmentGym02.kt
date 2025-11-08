package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EquipmentGym02: ImageVector
    get() {
        if (_equipmentGym02 != null) {
            return _equipmentGym02!!
        }
        _equipmentGym02 = ImageVector.Builder(
            name = "EquipmentGym02",
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
        moveTo(3f, 3f)
        lineTo(3f, 21f)
        moveTo(21f, 3f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 6f)
        lineTo(2f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 10f)
        curveTo(16.6046f, 10f, 17.5f, 10.9693f, 17.5f, 12.165f)
        curveTo(17.5f, 12.4484f, 17.4497f, 12.719f, 17.3583f, 12.967f)
        curveTo(17.0641f, 13.7653f, 13.8692f, 13.5843f, 13.6417f, 12.967f)
        curveTo(13.5503f, 12.719f, 13.5f, 12.4484f, 13.5f, 12.165f)
        curveTo(13.5f, 10.9693f, 14.3954f, 10f, 15.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 10f)
        curveTo(9.60457f, 10f, 10.5f, 10.9693f, 10.5f, 12.165f)
        curveTo(10.5f, 12.4484f, 10.4497f, 12.719f, 10.3583f, 12.967f)
        curveTo(10.0641f, 13.7653f, 6.86923f, 13.5843f, 6.64168f, 12.967f)
        curveTo(6.55027f, 12.719f, 6.5f, 12.4484f, 6.5f, 12.165f)
        curveTo(6.5f, 10.9693f, 7.39543f, 10f, 8.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 10f)
        verticalLineTo(6f)
        moveTo(15.5f, 10f)
        verticalLineTo(6f)
        }
        }.build()

        return _equipmentGym02!!
    }

private var _equipmentGym02: ImageVector? = null
