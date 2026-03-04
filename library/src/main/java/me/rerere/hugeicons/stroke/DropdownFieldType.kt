package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DropdownFieldType: ImageVector
    get() {
        if (_dropdownFieldType != null) {
            return _dropdownFieldType!!
        }
        _dropdownFieldType = ImageVector.Builder(
            name = "DropdownFieldType",
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
        moveTo(18f, 4f)
        horizontalLineTo(6f)
        curveTo(4.59987f, 4f, 3.8998f, 4f, 3.36502f, 4.27248f)
        curveTo(2.89462f, 4.51217f, 2.51217f, 4.89462f, 2.27248f, 5.36502f)
        curveTo(2f, 5.8998f, 2f, 6.59987f, 2f, 8f)
        curveTo(2f, 9.40013f, 2f, 10.1002f, 2.27248f, 10.635f)
        curveTo(2.51217f, 11.1054f, 2.89462f, 11.4878f, 3.36502f, 11.7275f)
        curveTo(3.8998f, 12f, 4.59987f, 12f, 6f, 12f)
        horizontalLineTo(18f)
        curveTo(19.4001f, 12f, 20.1002f, 12f, 20.635f, 11.7275f)
        curveTo(21.1054f, 11.4878f, 21.4878f, 11.1054f, 21.7275f, 10.635f)
        curveTo(22f, 10.1002f, 22f, 9.40013f, 22f, 8f)
        curveTo(22f, 6.59987f, 22f, 5.8998f, 21.7275f, 5.36502f)
        curveTo(21.4878f, 4.89462f, 21.1054f, 4.51217f, 20.635f, 4.27248f)
        curveTo(20.1002f, 4f, 19.4001f, 4f, 18f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 7.00002f)
        curveTo(18f, 7.00002f, 16.527f, 9f, 16f, 9f)
        curveTo(15.4729f, 9f, 14f, 7f, 14f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 16f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 20f)
        horizontalLineTo(14f)
        }
        }.build()

        return _dropdownFieldType!!
    }

private var _dropdownFieldType: ImageVector? = null
