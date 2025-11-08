package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CodeSquare: ImageVector
    get() {
        if (_codeSquare != null) {
            return _codeSquare!!
        }
        _codeSquare = ImageVector.Builder(
            name = "CodeSquare",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16f)
        curveTo(16.6161f, 16f, 17.1155f, 15.4883f, 17.1155f, 14.8571f)
        verticalLineTo(13.6162f)
        curveTo(17.1155f, 13.3131f, 17.233f, 13.0224f, 17.4422f, 12.8081f)
        lineTo(17.8366f, 12.4041f)
        curveTo(18.0545f, 12.1809f, 18.0545f, 11.8191f, 17.8366f, 11.5959f)
        lineTo(17.4422f, 11.1919f)
        curveTo(17.233f, 10.9776f, 17.1155f, 10.6869f, 17.1155f, 10.3838f)
        verticalLineTo(9.14286f)
        curveTo(17.1155f, 8.51167f, 16.6161f, 8f, 16f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 16f)
        curveTo(7.38392f, 16f, 6.88448f, 15.4883f, 6.88448f, 14.8571f)
        verticalLineTo(13.6162f)
        curveTo(6.88448f, 13.3131f, 6.76696f, 13.0224f, 6.55776f, 12.8081f)
        lineTo(6.16336f, 12.4041f)
        curveTo(5.94555f, 12.1809f, 5.94555f, 11.8191f, 6.16336f, 11.5959f)
        lineTo(6.55776f, 11.1919f)
        curveTo(6.76696f, 10.9776f, 6.88448f, 10.6869f, 6.88448f, 10.3838f)
        verticalLineTo(9.14286f)
        curveTo(6.88448f, 8.51167f, 7.38392f, 8f, 8f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 12f)
        horizontalLineTo(10.009f)
        moveTo(13.991f, 12f)
        horizontalLineTo(14f)
        }
        }.build()

        return _codeSquare!!
    }

private var _codeSquare: ImageVector? = null
