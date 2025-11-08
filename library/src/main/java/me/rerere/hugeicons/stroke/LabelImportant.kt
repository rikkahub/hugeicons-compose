package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LabelImportant: ImageVector
    get() {
        if (_labelImportant != null) {
            return _labelImportant!!
        }
        _labelImportant = ImageVector.Builder(
            name = "LabelImportant",
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
        moveTo(13f, 4f)
        horizontalLineTo(6.23456f)
        curveTo(3.79424f, 4f, 2.57407f, 4f, 2.14438f, 4.76649f)
        curveTo(2.13129f, 4.78984f, 2.11883f, 4.81353f, 2.10701f, 4.83754f)
        curveTo(1.71893f, 5.62592f, 2.41032f, 6.63129f, 3.7931f, 8.64204f)
        curveTo(4.89612f, 10.246f, 5.44763f, 11.048f, 5.4611f, 11.9555f)
        curveTo(5.46154f, 11.9852f, 5.46154f, 12.0148f, 5.4611f, 12.0445f)
        curveTo(5.44763f, 12.952f, 4.89612f, 13.754f, 3.7931f, 15.358f)
        curveTo(2.41032f, 17.3687f, 1.71893f, 18.3741f, 2.10701f, 19.1625f)
        curveTo(2.11883f, 19.1865f, 2.13129f, 19.2102f, 2.14438f, 19.2335f)
        curveTo(2.57407f, 20f, 3.79424f, 20f, 6.23456f, 20f)
        horizontalLineTo(13f)
        curveTo(14.9628f, 20f, 15.9443f, 20f, 16.7889f, 19.5777f)
        curveTo(17.6334f, 19.1554f, 18.2223f, 18.3703f, 19.4f, 16.8f)
        curveTo(21.1333f, 14.4889f, 22f, 13.3333f, 22f, 12f)
        curveTo(22f, 10.6667f, 21.1333f, 9.51111f, 19.4f, 7.2f)
        curveTo(18.2223f, 5.62972f, 17.6334f, 4.84458f, 16.7889f, 4.42229f)
        curveTo(15.9443f, 4f, 14.9628f, 4f, 13f, 4f)
        }
        }.build()

        return _labelImportant!!
    }

private var _labelImportant: ImageVector? = null
