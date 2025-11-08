package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InsertPi: ImageVector
    get() {
        if (_insertPi != null) {
            return _insertPi!!
        }
        _insertPi = ImageVector.Builder(
            name = "InsertPi",
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
        moveTo(3f, 8.8f)
        curveTo(3f, 7f, 5.06126f, 5.2f, 7.68468f, 5.2f)
        lineTo(16.9574f, 5.2f)
        curveTo(19.2f, 5.2f, 21f, 3.85f, 21f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 5.5f)
        lineTo(16f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 5.5f)
        curveTo(9.86667f, 8.5625f, 9.6f, 14.25f, 9.2f, 16f)
        curveTo(8.8f, 17.75f, 8f, 19.5f, 6f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 16.1667f)
        verticalLineTo(17.5f)
        moveTo(17f, 17.5f)
        verticalLineTo(18.8333f)
        moveTo(17f, 17.5f)
        horizontalLineTo(18.3333f)
        moveTo(17f, 17.5f)
        horizontalLineTo(15.6667f)
        moveTo(21f, 17.5f)
        curveTo(21f, 19.7091f, 19.2091f, 21.5f, 17f, 21.5f)
        curveTo(14.7909f, 21.5f, 13f, 19.7091f, 13f, 17.5f)
        curveTo(13f, 15.2909f, 14.7909f, 13.5f, 17f, 13.5f)
        curveTo(19.2091f, 13.5f, 21f, 15.2909f, 21f, 17.5f)
        }
        }.build()

        return _insertPi!!
    }

private var _insertPi: ImageVector? = null
