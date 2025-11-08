package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mentoring: ImageVector
    get() {
        if (_mentoring != null) {
            return _mentoring!!
        }
        _mentoring = ImageVector.Builder(
            name = "Mentoring",
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
        lineTo(10f, 16f)
        horizontalLineTo(2f)
        lineTo(4f, 22f)
        horizontalLineTo(12f)
        moveTo(12f, 22f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13f)
        verticalLineTo(12.5f)
        curveTo(12f, 10.6144f, 12f, 9.67157f, 11.4142f, 9.08579f)
        curveTo(10.8284f, 8.5f, 9.88562f, 8.5f, 8f, 8.5f)
        curveTo(6.11438f, 8.5f, 5.17157f, 8.5f, 4.58579f, 9.08579f)
        curveTo(4f, 9.67157f, 4f, 10.6144f, 4f, 12.5f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 13f)
        curveTo(19f, 14.1046f, 18.1046f, 15f, 17f, 15f)
        curveTo(15.8954f, 15f, 15f, 14.1046f, 15f, 13f)
        curveTo(15f, 11.8954f, 15.8954f, 11f, 17f, 11f)
        curveTo(18.1046f, 11f, 19f, 11.8954f, 19f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 4f)
        curveTo(10f, 5.10457f, 9.10457f, 6f, 8f, 6f)
        curveTo(6.89543f, 6f, 6f, 5.10457f, 6f, 4f)
        curveTo(6f, 2.89543f, 6.89543f, 2f, 8f, 2f)
        curveTo(9.10457f, 2f, 10f, 2.89543f, 10f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 17.5f)
        horizontalLineTo(20f)
        curveTo(21.1046f, 17.5f, 22f, 18.3954f, 22f, 19.5f)
        verticalLineTo(20f)
        curveTo(22f, 21.1046f, 21.1046f, 22f, 20f, 22f)
        horizontalLineTo(19f)
        }
        }.build()

        return _mentoring!!
    }

private var _mentoring: ImageVector? = null
