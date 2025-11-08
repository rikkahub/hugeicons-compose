package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FourCircle: ImageVector
    get() {
        if (_fourCircle != null) {
            return _fourCircle!!
        }
        _fourCircle = ImageVector.Builder(
            name = "FourCircle",
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
        moveTo(15f, 7f)
        verticalLineTo(12.5f)
        moveTo(15f, 12.5f)
        verticalLineTo(17f)
        moveTo(15f, 12.5f)
        horizontalLineTo(9.43601f)
        curveTo(9.19521f, 12.5f, 9f, 12.3048f, 9f, 12.064f)
        curveTo(9f, 12.0216f, 9.00619f, 11.9794f, 9.01839f, 11.9387f)
        lineTo(10.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }
        }.build()

        return _fourCircle!!
    }

private var _fourCircle: ImageVector? = null
