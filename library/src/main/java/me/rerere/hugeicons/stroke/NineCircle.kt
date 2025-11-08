package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NineCircle: ImageVector
    get() {
        if (_nineCircle != null) {
            return _nineCircle!!
        }
        _nineCircle = ImageVector.Builder(
            name = "NineCircle",
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
        moveTo(11f, 12f)
        horizontalLineTo(13f)
        curveTo(14.1046f, 12f, 15f, 11.1046f, 15f, 10f)
        verticalLineTo(9f)
        curveTo(15f, 7.89543f, 14.1046f, 7f, 13f, 7f)
        horizontalLineTo(11f)
        curveTo(9.89543f, 7f, 9f, 7.89543f, 9f, 9f)
        verticalLineTo(10f)
        curveTo(9f, 11.1046f, 9.89543f, 12f, 11f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9.5f)
        verticalLineTo(15f)
        curveTo(15f, 16.1046f, 14.1046f, 17f, 13f, 17f)
        horizontalLineTo(11f)
        curveTo(9.89543f, 17f, 9f, 16.1046f, 9f, 15f)
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

        return _nineCircle!!
    }

private var _nineCircle: ImageVector? = null
